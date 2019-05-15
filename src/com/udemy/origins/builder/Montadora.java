package br.com.udemy.origins.builder;

public class Montadora {
	private MontadoraBuilder montadoraBuilder = new MontadoraVeiculoBuilder();
	
	public Veiculo montar(String modelo, String tipo) {
		montadoraBuilder.build(modelo, tipo);
		return montadoraBuilder.getVeiculo();
	}
}
