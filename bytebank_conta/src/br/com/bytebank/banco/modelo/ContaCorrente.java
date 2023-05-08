package br.com.bytebank.banco.modelo;

//Conta Corrente é uma Conta e assina o contratado Tributavel
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {

	}

	// Construtor sendo chamado pela class mãe
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saque(double valorSaque) {
		super.saque(valorSaque);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1;

	}

	@Override
	public String toString() {
		return "ContaCorrente: " + super.toString();
	}

}
