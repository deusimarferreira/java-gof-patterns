package br.com.udemy.origins.prototype;

public class Ovelha implements Cloneable {
	public String nome;
	
	public Ovelha(String nome) {
		this.nome = nome;
	}
	
	public Object clone() {
		Object object = null;
		
		try {
			object = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return object;
	}
}
