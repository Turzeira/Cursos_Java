package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {

//		List numeros = new ArrayList();
//		
//		int idade = 29; // primitivo
//		numeros.add(29 ou idade);// Autoboxing

		Integer idadeRef = Integer.valueOf(29);// autoboxing
		int valor = idadeRef.intValue(); // unboxing
		System.out.println(valor);

		List<Integer> numeros = new ArrayList<Integer>();

		String s = args[0];// "12"
		// Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		numeros.add(idadeRef);
	}

}
