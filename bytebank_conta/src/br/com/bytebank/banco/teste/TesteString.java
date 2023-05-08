package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";

		// nome.replace("Alura", "ALURA");
		String alteracao = nome.replace("Alura", "ALURA");

		System.out.println("Principal: " + nome);
		System.out.println("Alteração: " + alteracao + "\n");

		// nome.toUpperCase();
		String maiusculo = nome.toUpperCase();
		String minisculo = nome.toLowerCase();
		System.out.println("To Upper: " + maiusculo);
		System.out.println("To Lower: " + minisculo);

		char c = nome.charAt(2); // qual carater está na posição 2
		System.out.println("\nCharAt: " + c);
		
		int i = nome.indexOf("lu"); // onde começa a string 
		System.out.println("\nIndexOf: "+i);
		
		
		String subString = nome.substring(1);
		System.out.println("\nSubString: "+subString);
		
		int tamanho = nome.length();
		System.out.println("\nLength: "+tamanho);
		
		System.out.println("\nisEmpty: "+nome.isEmpty());// verifica se esta vazia a string 
		
		String novoNome = "    Arthur ";
		System.out.println("\nNovo nome: "+novoNome);
		
		String tiraEspaco = novoNome.trim();
		System.out.println("Trim: "+tiraEspaco);

		
		System.out.println("\nContains: "+ novoNome.contains("thur"));
		
		
	}

}
