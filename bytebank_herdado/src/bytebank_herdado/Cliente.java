package bytebank_herdado;

public class Cliente implements Autenticavel {

	private MetodoAutenticar metodo;
	
	
	public Cliente() {
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
