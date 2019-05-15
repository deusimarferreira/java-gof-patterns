package br.com.udemy.origins.abstractfactory;

public class FabricaGuarda implements Modelo {
	public Cachorro getCachorro() {
		return new Shitzu();
	}
	
	public Gato getGato() {
		return new RagDoll();
	}
}
