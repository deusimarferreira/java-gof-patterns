package br.com.udemy.origins.builder;

public class Jeep extends Veiculo {
	private String nome;
	
	public Jeep(String modelo) {
		super(modelo, "SUV");
		this.nome = "Jeep";
	}
	
	public String toString() {
		return "Veículo: " + this.nome + " " + this.getModelo() + " " + this.getTipo();
	}
}
