package br.com.udemy.structures.proxy;

class SerSupremoReal implements SerSupremo {
    public String responder(String pergunta) {
        return "Porque 42 é a resposta para tudo";
    }
}