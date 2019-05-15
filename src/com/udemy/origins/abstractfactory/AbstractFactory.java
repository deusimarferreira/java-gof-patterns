package br.com.udemy.origins.abstractfactory;

import java.util.Scanner;

public class AbstractFactory {
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new AbstractFactory().executar();
	}
	public void executar() {
		System.out.println("Informe 1 - Companhia ou 2 - Guarda");
		byte opc = sc.nextByte();
		
		Modelo modelo = null;
		
		switch (opc) {
		case 1:
			modelo = new FabricaCompanhia();
			break;

		case 2:
			modelo = new FabricaGuarda();
			break;
		}
		
		System.out.println("Cachorro: " + modelo.getCachorro());
		System.out.println("Gato: " + modelo.getGato());
	}

}
