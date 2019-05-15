package br.com.udemy.structures.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> componentes;
    
    public Menu(String descricao){
        super(descricao, null);
        componentes = new ArrayList<MenuComponent>();
    }

    public void add(MenuComponent component){
        this.componentes.add(component);
    }

    public void print(){
        System.out.println(">> " + super.toString());
        for(MenuComponent cp: componentes){
            cp.print();
        }
    }
}