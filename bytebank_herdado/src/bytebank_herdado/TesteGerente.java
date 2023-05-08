package bytebank_herdado;

public class TesteGerente {
	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Arthur");
		gerente.setCpf("525656245");
		gerente.setSalario(1950.00);

		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Bonificação: " + gerente.getBonificacao());

//		gerente.setSenha(2222);
//		System.out.println("Acesso a conta: " + gerente.autentica(gerente.getSenha()));

	}
}
