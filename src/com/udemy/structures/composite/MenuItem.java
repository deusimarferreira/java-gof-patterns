package br.com.udemy.structures.composite;

public class MenuItem extends MenuComponent {
    MenuItem(String descricao, String link){
        super(descricao, link);
    }

    public void print(){
        System.out.println(super.toString());
    }
}