package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta contaCorrente = new ContaCorrente(11, 12);
		lista.add(contaCorrente);

		Conta contaPoupanca = new ContaPoupanca(22, 22);
		lista.add(contaPoupanca);
		Conta contaPoupanca2 = new ContaPoupanca(22, 22);

		//aqui teve que implentar o equals na class Conta
		boolean existe = lista.contains(contaPoupanca2);
		
		System.out.println("Já existe? " + existe);
		
		//mesmo for so que sem contator, ele percorre toda a conta
		for(Conta imprimirConta : lista) {
			System.out.println(imprimirConta);
		}
	}

}
