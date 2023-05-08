package bytebank_herdado;

//Contrato Autenticavel
	//quem assin o contrato, precisa implementar 
		// metodo setsenha e autentica
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
