package br.com.udemy.origins.builder;

public class Build {
	public static void main(String[] args) {
		new Build().executar();
	}
	
	public void executar() {
		Montadora montadora = new Montadora();
		
		Veiculo ferrari = montadora.montar("California", "F");
		Veiculo jeep = montadora.montar("Compass", "J");
		
		System.out.println(ferrari);
		System.out.println(jeep);
	}
}
