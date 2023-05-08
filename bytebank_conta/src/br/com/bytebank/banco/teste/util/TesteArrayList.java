package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		//So pode criar conta 
		ArrayList<Conta> lista = new ArrayList<Conta>();

		//LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta contaCorrente = new ContaCorrente(11, 12);
		lista.add(contaCorrente);

		Conta contaPoupanca = new ContaPoupanca(22, 22);
		lista.add(contaPoupanca);

		System.out.println("Quantidade de elementos da lista: " + lista.size());

		Conta ref = (Conta) lista.get(0);
		// Object ref = lista.get(0);
		System.out.println("Conta na posição 0 : " + ref.getNumero());

		lista.remove(0);
		System.out.println("\nElemento removido com sucesso ");
		System.out.println("\nNovo tamanho da lista: " + lista.size());

		Conta contaPoupanca1 = new ContaPoupanca(32, 42);
		lista.add(contaPoupanca1);
		System.out.println("\n---------------------------\n");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("---------------------------\n");
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
