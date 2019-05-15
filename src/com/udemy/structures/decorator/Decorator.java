package br.com.udemy.structures.decorator;

public class Decorator {
    public static void main(String [] args) {
        new Decorator().combine();
    }
    public void combine() {
        new ErvilhaVerde(new ErvilhaVermelha());
        new ErvilhaAmarela(new ErvilhaVerde());
        new ErvilhaAmarela();
    }
}
