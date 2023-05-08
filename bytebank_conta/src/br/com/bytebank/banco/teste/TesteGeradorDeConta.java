package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGeradorDeConta {
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta contaCorrente = new ContaCorrente(22,11);
		guardador.adiciona(contaCorrente);
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println("Quantidade de contas criadadas: " + tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println("\nConta Criada:  "+ref.getNumero() +"\nAgência: " +ref.getAgencia());
		
	}

}
