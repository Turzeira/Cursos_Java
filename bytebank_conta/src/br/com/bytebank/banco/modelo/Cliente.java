package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Byteback
 * 
 * @author Arthur Nunes Ribeiro
 * @version 0.1
 *
 */

public class Cliente {

	private String nome;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
