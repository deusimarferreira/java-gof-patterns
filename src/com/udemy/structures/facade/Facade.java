package br.com.udemy.structures.facade;

public class Facade {
    private RnFacade rn = new RnFacade();
    
    public static void main(String[] args) {
        new Facade().trabalhar();
    }
    public void trabalhar() {
        rn.comprar(Categoria.NORMAL);
        rn.alugar(Categoria.NORMAL);
    }
}