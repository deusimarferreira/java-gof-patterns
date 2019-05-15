package br.com.udemy.structures.adapter;

public class Adapter implements Vetor {
	private CaixaArraste caixa = new CaixaArraste();
	
	public int getX() {
		Coordenada coordenada = caixa.getTopoEsq();
		return coordenada.getIntX();
	}
	public int getY() {
		Coordenada coordenada = caixa.getTopoEsq();
		return coordenada.getIntY();
	}
	public int getAltura() {
		Coordenada coordenada1 = caixa.getTopoEsq();
		Coordenada coordenada2 = caixa.getRodapeDir();
		return coordenada2.getIntX() - coordenada1.getIntX();
	}
	public int getLargura() {
		Coordenada coordenada1 = caixa.getTopoEsq();
		Coordenada coordenada2 = caixa.getRodapeDir();
		return coordenada2.getIntY() - coordenada1.getIntY();
	}	
}
