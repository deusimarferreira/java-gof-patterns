package br.com.udemy.structures.bridge;

public class Livro extends BridgePublicacao{
    public Livro(String titulo, String autor){
        super(new LivroImpl());
        ((LivroImpl)getPublicacao()).setTitulo("GOF 2");
        ((LivroImpl)getPublicacao()).setAutor("FOUR");
    }

    public String toString(){
        return ((LivroImpl)getPublicacao()).getTitulo() + " " + ((LivroImpl)getPublicacao()).getAutor();
    }
}