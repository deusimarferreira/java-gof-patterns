package br.com.udemy.structures.facade;

class Cd {
    private float preco;

    public Cd(Categoria categoria) {
        switch (categoria) {
            case PROMOCIONAL: preco = 9.99f;
            case LANCAMENTO: preco = 29.99f;
            case NORMAL: preco = 19.99f;
        }
    }
    public float getPreco() {
        return preco;
    }
}