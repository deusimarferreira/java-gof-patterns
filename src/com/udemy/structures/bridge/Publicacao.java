package br.com.udemy.structures.bridge;

abstract class Publicacao {
    private BridgePublicacao bridgePublicacao;

    /**
     * @return the bridgePublicacao
     */
    public BridgePublicacao getBridgePublicacao() {
        return bridgePublicacao;
    }

    /**
     * @param bridgePublicacao the bridgePublicacao to set
     */
    public void setBridgePublicacao(BridgePublicacao bridgePublicacao) {
        this.bridgePublicacao = bridgePublicacao;
    }

}