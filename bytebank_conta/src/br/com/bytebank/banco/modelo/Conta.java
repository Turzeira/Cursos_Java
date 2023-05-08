package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * 
 * @author Arthur Nunes Ribeiro
 * @version 0.1
 */

public abstract class Conta extends Object{

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	// Construtor sem parametros
	public Conta() {

	}

	/**
	 * Construtor da classe Conta com os paramentros agencia e numero da conta
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println();
//		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
// 		System.out.println("Estou criando uma conta " + this.numero);
	}

	public void deposita(double valorDepositado) {
		this.saldo = this.saldo + valorDepositado;
	}

	public void saque(double valorSaque) {

		if (saldo < valorSaque) {
			throw new SaldoInsuficienteException("\nSaldo " + this.saldo + " é insuficiente" + " para essa operação");
		}
		this.saldo -= valorSaque;
		System.out.println("Operação realizado com sucesso!");
		System.out.println("O saldo atual é " + this.saldo);

	}

	public void transfere(double valorTransfere, Conta contaDestino) {
		this.saque(valorTransfere);
		contaDestino.deposita(valorTransfere);// ele so continua se a execução de cima funciona
	}
	
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agência: " +this.agencia;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O numero da agencia nao pode ser negativo ou nulo");
		} else {
			this.agencia = agencia;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O numero da conta nao pode ser negativo ou nulo");
		} else {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

}
