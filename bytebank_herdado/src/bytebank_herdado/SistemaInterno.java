package bytebank_herdado;

public class SistemaInterno {

	private int senha = 2222;

	public void sistemaAutentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acesso Permitido");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}
