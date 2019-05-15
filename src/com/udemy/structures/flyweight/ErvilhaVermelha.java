package br.com.udemy.structures.flyweight;

class ErvilhaVermelha extends ErvilhaCombinada {
    public ErvilhaVermelha(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }
    public ErvilhaVermelha() {
        super(null);
    }
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    public void mostrarCor() {
        System.out.println("Ervilha Vermelha");
    }
}