package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(0);

		Administrador adm = new Administrador();
		adm.setSenha(0);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);

		SistemaInterno sistema = new SistemaInterno();
		sistema.sistemaAutentica(gerente);
		sistema.sistemaAutentica(adm);
		sistema.sistemaAutentica(cliente);
		
	}

}
