package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;// criando array tipo conta
	private int posicaoLivre;

	public GuardadorDeContas() {

		// inicializando o array
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos(){
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
