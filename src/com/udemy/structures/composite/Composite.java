package br.com.udemy.structures.composite;

public class Composite {
    public static void main(String[] args){
        new Composite().montaMenu();
    }

    public void montaMenu(){
        Menu menu = new Menu("Menu 1");
        menu.add(new MenuItem("Item 1", "Evento 1"));
        menu.add(new MenuItem("Item 2", "Evento 2"));
        Menu menu2 = new Menu("Menu 2");
        menu2.add(new MenuItem("Item 3", "Evento 3"));
        menu2.add(new MenuItem("Item 4", "Evento 4"));
        menu2.add(new MenuItem("Item 5", "Evento 5"));
        Menu principal = new Menu("Principal 2");
        principal.add(menu);
        principal.add(menu2);

        principal.print();
    }
}