package br.com.udemy.origins.abstractfactory;

public class FabricaCompanhia implements Modelo{
	public Cachorro getCachorro() {
		return new Shitzu();
	}
	
	public Gato getGato() {
		return new Persa();
	}
}
