package br.com.udemy.structures.bridge;

public class Cliente {
    public static void main (String[] args){

    }

    public void publicar() {
        Livro livro = new Livro("GOF", "Four");
        System.out.println(livro);
    }
}