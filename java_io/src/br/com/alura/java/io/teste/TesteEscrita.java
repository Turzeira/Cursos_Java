package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Escrita/Saida com arquivo
		OutputStream file = new FileOutputStream("Java_2.txt");
		Writer transformador = new OutputStreamWriter(file); // transforamando byte em caracter
		BufferedWriter bw = new BufferedWriter(transformador); // Tranformar os caracter em uma linha

		bw.write("Aprendendo a biblioteca java.io");
		bw.newLine();
		
		bw.close();

	}

}
