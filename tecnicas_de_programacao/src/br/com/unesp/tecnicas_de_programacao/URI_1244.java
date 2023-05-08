package br.com.unesp.tecnicas_de_programacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class URI_1244 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite quanto conjuntos de string voce irá digitar: ");
			int N = teclado.nextInt();

			for (int i = 0; i < N; i++) {
				String linha = teclado.nextLine();
				String espaco[] = linha.split(" "); //dividi a string com base no espaço
				List<String> lista = new ArrayList<String>();

				for (int j = 0; j < espaco.length; j++) {
					lista.add(espaco[j]);
				}

				while (!lista.isEmpty()) {
					 String maior = "";
		                Iterator<String> iterator = lista.iterator();
		                while (iterator.hasNext()) {
		                    String x = iterator.next();
		                    if (x.length() > maior.length())
		                        maior = x;
							System.out.printf("%s", maior);
							if (lista.contains(maior))
								lista.remove(maior);

							if (!lista.isEmpty())
								System.out.printf(" ");
						}
						System.out.println("");
					}
					teclado.close();
				}

			}

		}

	}
