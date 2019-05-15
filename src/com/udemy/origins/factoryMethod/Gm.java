package br.com.udemy.origins.factoryMethod;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

import br.com.udemy.origins.builder.MontadoraBuilder;

public class Gm extends MontadoraFactory {
	public Opala factoryOpala() {
		return new Opala();
	}
	
	public Vectra factoryVectra() {
		return new Vectra();
	}
}
