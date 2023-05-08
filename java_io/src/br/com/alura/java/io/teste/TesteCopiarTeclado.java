package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarTeclado {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com arquivo
		InputStream file = System.in;
		Reader transformador = new InputStreamReader(file); 
		BufferedReader br = new BufferedReader(transformador);

		// Fluxo de Escrita/Saida com arquivo
		OutputStream out = System.out; //new FileOutputStream("Java_4.txt");
		Writer trans = new OutputStreamWriter(out); 
		BufferedWriter bw = new BufferedWriter(trans); 

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}

}
