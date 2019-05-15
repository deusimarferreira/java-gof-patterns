package br.com.udemy.structures.bridge;

abstract class BridgePublicacao {
    private Publicacao publicacao;

    public BridgePublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
	}

	/**
     * @return the publicacao
     */
    public Publicacao getPublicacao() {
        return publicacao;
    }


}