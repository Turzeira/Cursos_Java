package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

	private MetodoAutenticar metodo;

	public Administrador() {
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
