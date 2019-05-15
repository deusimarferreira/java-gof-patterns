package br.com.udemy.structures.composite;

abstract class MenuComponent{
    private String descricao;
    private String link;

    public MenuComponent(String descricao, String link) {
        this.descricao = descricao;
        this.link = link;
    }

    public String toString(){
        if(link != null)
            return "\t" + this.descricao + " - " + this.link;

        return this.descricao;
    }

    public abstract void print();
}