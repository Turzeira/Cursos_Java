package br.com.alura.bytebank_biblioteca;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123,321);
		conta.deposita(120);
		System.out.println("Saldo = "+conta.getSaldo());
	}

}
