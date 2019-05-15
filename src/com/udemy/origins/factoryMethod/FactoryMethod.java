package br.com.udemy.origins.factoryMethod;

public class FactoryMethod {
	public static void main(String[] args) {
		new FactoryMethod().construir();
	}
	
	public void construir() {
		MontadoraFactory gm = new Gm();
		Veiculo opala = gm.factoryOpala();
		Veiculo vectra = gm.factoryVectra();
		
		System.out.println("Veículo: " + opala.getModelo());
		System.out.println("Veículo: " + vectra.getModelo());
	}
}
