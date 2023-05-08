package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiar {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com arquivo
		InputStream file = new FileInputStream("java.txt");
		Reader transformador = new InputStreamReader(file); 
		BufferedReader br = new BufferedReader(transformador);

		// Fluxo de Escrita/Saida com arquivo
		OutputStream out = new FileOutputStream("Java_3.txt");
		Writer trans = new OutputStreamWriter(out); 
		BufferedWriter bw = new BufferedWriter(trans); 

		String linha = br.readLine();
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();

	}

}
