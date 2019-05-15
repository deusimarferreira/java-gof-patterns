package br.com.udemy.structures.proxy;

public class Proxy {
    public static void main(String [] args) {
        new Proxy().problema();
    }
    public void problema() {
        SerSupremo ser = new Intermediario();
        System.out.println(ser.responder("Qual o sentido da Vida?"));
    }
}