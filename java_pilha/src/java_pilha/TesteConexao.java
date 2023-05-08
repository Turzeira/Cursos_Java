package java_pilha;

public class TesteConexao {
	
	public static void main(String[] args) {

	try(Conexao conexao = new Conexao()){
		conexao.leDados();
	}catch(Exception ex) {
		System.out.println("Erro na leitura de dados");
	}
	
//  ---------------------------------------------------- //	
	
//	Conexao con = null;
//	try {
//		con = new Conexao();
//		con.leDados();
//	}catch(IllegalStateException ex) {
//		System.out.println("Erro na conexão");
//	}finally {
//		con.close();
//	}
	
	
	}
	
}
