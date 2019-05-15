package br.com.udemy.origins.builder;

public class Ferrari extends Veiculo {
	private String nome;
	
	public Ferrari(String modelo) {
		super(modelo, "Esportivo");
		this.nome = "Ferrari";
	}
	
	public String toString() {
		return "Ve�culo: " + this.nome + " " + this.getModelo() + " " + this.getTipo();
	}
}
