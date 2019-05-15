package br.com.udemy.structures.flyweight;

public class Flyweight {
    public static void main(String [] args) {
        new Flyweight().combine();
    }
    public void combine() {
        ErvilhaFlyWeight fly = new ErvilhaFlyWeight();
        fly.mostrar(new ErvilhaVerde());
        fly.mostrar(new ErvilhaVermelha());
        fly.mostrar(new ErvilhaAmarela());
    }
}
