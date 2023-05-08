package bytebank_herdado;

//Gerente é um funcionario que por sua vez assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	public double getBonificacao() {
		double bonificacao = super.getSalario();
		System.out.println("Bonificação do Gerente = " + bonificacao);
		return bonificacao;
	}

	private MetodoAutenticar metodo;

	public Gerente() {
		this.metodo = new MetodoAutenticar();
	}

	@Override
	public void setSenha(int senha) {
		this.metodo.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.metodo.autentica(senha);
	}

}
