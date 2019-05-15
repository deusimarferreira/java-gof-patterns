package br.com.udemy.structures.facade;

class RnFacade {
    private Cliente cliente;
    private Gravadora gravadora;
    
    public RnFacade() {
        cliente = new Cliente();
        gravadora = new Gravadora();
    }
    public void comprar(Categoria c) {
        Cd cd = new Cd(c);
        cliente.addComprar();
        gravadora.setRepasse(cd.getPreco() * 0.5f);
    }
    public void alugar(Categoria c) {
        Cd cd = new Cd(c);
        cliente.addComprar();
        gravadora.setRepasse(cd.getPreco() * 0.05f);
    }
}