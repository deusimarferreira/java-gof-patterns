package br.com.udemy.origins.abstractfactory;

public abstract class Pet {
	private String name;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
