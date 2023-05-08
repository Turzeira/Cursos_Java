package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrasWrappers {
	public static void main(String[] args) {

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef);
		System.out.println(dRef.doubleValue());//unboxing
		
		
		Boolean bRef = Boolean.FALSE; //autoboxing 
		System.out.println(bRef.booleanValue());
		
		List<Number>lista = new ArrayList<>();
		lista.add(10);
		lista.add(2.0);
		lista.add(12.12f);
		System.out.println(lista);
		
		
		
	}

}
