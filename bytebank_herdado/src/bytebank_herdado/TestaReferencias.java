package bytebank_herdado;

public class TestaReferencias {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Arthur");
		gerente.setSalario(2000.00);

		Gerente gerente2 = new Gerente();
		gerente2.setNome("Ana Luiza");
		gerente2.setSalario(2000.00);

		EditorVideo editor = new EditorVideo();
		editor.setSalario(1500.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(gerente); // gerente é funcionario
		controle.registro(gerente2);
		controle.registro(editor); // gerente é funcionario

		System.out.println("Soma das bonificações: " + controle.getSoma());

	}
}
