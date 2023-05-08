package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta contaCorrente = new ContaCorrente(22, 11);
		guardador.adiciona(contaCorrente);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Quantidade de contas criadadas: " + tamanho);

		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println("\nConta Criada:  " + ref.getNumero() + "\nAgência: " + ref.getAgencia());

	}

}
