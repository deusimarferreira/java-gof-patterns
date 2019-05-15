package br.com.udemy.structures.flyweight;

class ErvilhaAmarela extends ErvilhaCombinada {
    public ErvilhaAmarela(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }
    public ErvilhaAmarela() {
        super(null);
    }
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    public void mostrarCor() {
        System.out.println("Ervilha Amarela");
    }
}