package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com arquivo
		InputStream file = new FileInputStream("java.txt");
		Reader transformador = new InputStreamReader(file); // transforamando byte em caracter
		BufferedReader br = new BufferedReader(transformador); // Tranformar os caracter em uma linha

		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

	}

}
