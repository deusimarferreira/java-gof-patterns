package br.com.udemy.origins.singleton;

public class ContaCorrente {
	public String numeroConta;
	private static ContaCorrente instancia;

	private ContaCorrente() {
		
	}
	
	public static ContaCorrente getInstancia() {
		if(instancia == null) {
			instancia = new ContaCorrente();
		}
		return instancia;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String toString() {
		return this.numeroConta;
	}
}
