package br.com.udemy.structures.facade;

class Cliente {
    private short comprar;
    private short alugar;

    public void addComprar() {
        this.comprar++;
    }
    public void addAlugar() {
        this.alugar++;
    }
    public String toString() {
        return "[Cliente] compras: " + this.comprar + " aluguel: " + this.alugar;
    }
}