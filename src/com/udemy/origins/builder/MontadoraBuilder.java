package br.com.udemy.origins.builder;

public interface MontadoraBuilder {
	public void build(String modelo, String tipo);
	public Veiculo getVeiculo();
}
