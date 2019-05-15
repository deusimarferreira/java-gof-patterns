package br.com.udemy.origins.prototype;

public class PrototypeImpl implements Prototype {
	public Ovelha copiar(Ovelha ovelha) {
		return (Ovelha) ovelha.clone();
	}
}
