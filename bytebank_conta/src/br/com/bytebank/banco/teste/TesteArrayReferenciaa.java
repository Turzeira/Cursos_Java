package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferenciaa {
	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente conta1 = new ContaCorrente(11, 22);
		contas[0] = conta1;

		ContaCorrente conta2 = new ContaCorrente(22, 11);
		contas[1] = conta2;

		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(ref.getNumero());
	}

}
