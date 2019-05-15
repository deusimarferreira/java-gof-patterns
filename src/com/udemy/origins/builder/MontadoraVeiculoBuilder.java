package br.com.udemy.origins.builder;

public class MontadoraVeiculoBuilder implements MontadoraBuilder {
	private Veiculo veiculo;
	
	public void build(String modelo, String tipo) {
		switch(tipo) {
			case "F":
				veiculo = new Ferrari(modelo);
			break;
			case "J":
				veiculo = new Jeep(modelo);
			break;
		}
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
}
