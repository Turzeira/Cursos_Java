package bytebank_herdado;

//Editor de Video é um funcionario
public class EditorVideo extends Funcionario {

	public EditorVideo() {

	}

	public double getBonificacao() {
		double bonificacao = 100;
		System.out.println("Bonificação do Editor de Vídeo = " + bonificacao);
		return bonificacao;
	}

}
