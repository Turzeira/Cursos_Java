package br.com.bytebank.banco.modelo;


public class CalculadorImposto {
	
	private double totalImposto;
	
	public double calculaImposto(Tributavel t) {
		this.totalImposto += t.getValorImposto();
		return t.getValorImposto();
	}
	
	public void totalImposto() {
		System.out.println("O total de imposto arrecado é " + this.totalImposto);
	}
}
