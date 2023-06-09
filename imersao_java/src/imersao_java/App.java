package imersao_java;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) throws Exception {

		// Fazer uma conexão HTTP(como acessar um site) e buscar os TOP MOVIES
		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();

		// Extrair só os dados que interessam(Titulo, poster , classificação)
		JsonParser parser = new JsonParser();
		List<Map<String, String>> listaDeFilmes = parser.parse(body);

		// Exibir e manipular os dados da nossa forma
		for (Map<String, String> filme : listaDeFilmes) {
			GeradoraDeFigurinhas geradora = new GeradoraDeFigurinhas();
			
			String urlImagem = filme.get("image");
			String titulo = filme.get("title");
			String nomeArquivo = titulo;
			InputStream inputStream = new URL(urlImagem).openStream();

			System.out.println(filme.get("title"));
			System.out.println(filme.get("image"));
			System.out.println(filme.get("imDbRating"));

			geradora.cria(inputStream, nomeArquivo);
			System.out.println();
		}

	}

}
