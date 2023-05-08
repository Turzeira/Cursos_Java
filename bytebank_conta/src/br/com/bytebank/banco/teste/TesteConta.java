package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; //importa tudo do package modelo

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100, 10);
		contaCorrente.deposita(1000.0);

		ContaPoupanca contaPoupanca = new ContaPoupanca(100, 20);
		contaPoupanca.deposita(200.0);

		contaCorrente.transfere(10, contaPoupanca);

		System.out.println("Agência: " + contaCorrente.getAgencia() + " \nNumero: " + contaCorrente.getNumero() + " \nSaldo: "
				+ contaCorrente.getSaldo());
		
		System.out.println("\nAgência: " + contaPoupanca.getAgencia() + " \nNumero: " + contaPoupanca.getNumero() + " \nSaldo: "
				+ contaPoupanca.getSaldo());
		
		SeguroVida seguroVida = new SeguroVida();
		seguroVida.setValorContrato(1000);
		
		CalculadorImposto calculadora = new CalculadorImposto();
		System.out.println();
		System.out.println("O valor do imposto da Conta " +contaCorrente.getNumero()+" = " +calculadora.calculaImposto(contaCorrente));
		System.out.println("O valor do imposto do seguro de vida = " +calculadora.calculaImposto(seguroVida));
		calculadora.totalImposto();
		
	}
	
		

}
