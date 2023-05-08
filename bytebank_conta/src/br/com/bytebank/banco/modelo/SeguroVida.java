package br.com.bytebank.banco.modelo;
public class SeguroVida implements Tributavel {

	private double valorContrato;

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	@Override
	public double getValorImposto() {
		return valorContrato*0.15;

	}

}
