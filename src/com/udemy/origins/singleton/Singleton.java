package br.com.udemy.origins.singleton;

public class Singleton {
	public static void main(String[] args) {
		new Singleton().executar();
	}
	
	public void executar() {
		ContaCorrente c1 = ContaCorrente.getInstancia();
		c1.setNumeroConta("123-01");
		System.out.println("Hash c1: " + c1.toString() + " Hash: " + c1.hashCode());
		
		ContaCorrente c2 = ContaCorrente.getInstancia();
		c2.setNumeroConta("456-01");
		System.out.println("Hash c2: " + c2.toString() + " Hash: " + c2.hashCode());
	}
}
