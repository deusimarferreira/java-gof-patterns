package br.com.udemy.origins.prototype;

public class PrototypeRun {
	public static void main(String[] args) {
		new PrototypeRun().executar();
	}
	
	public void executar() {
		Ovelha original = new Ovelha("Dolly");
		Ovelha clone = new PrototypeImpl().copiar(original);
		
		System.out.println("Original: " + original);
		System.out.println("Clone: " + clone);
	}
}
