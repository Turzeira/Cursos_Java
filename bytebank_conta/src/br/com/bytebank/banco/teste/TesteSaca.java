package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSaca {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		conta.saque(200.0);

		ContaPoupanca contaPoupanca = new ContaPoupanca(124, 421);
		System.out.println();
		contaPoupanca.deposita(200);
		contaPoupanca.transfere(200, conta);

		// tratamento da exceção
		try {
			conta.transfere(210, contaPoupanca);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
