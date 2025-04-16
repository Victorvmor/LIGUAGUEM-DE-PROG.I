package org.example.controller;

public class Fruta {
    private String nome;
    private String cor;
    private String podre;

    public Fruta(String nome, String cor, String podre) {
        this.nome = nome;
        this.cor = cor;
        this.podre = podre;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getPodre() {
        return podre;
    }

    public String verificarEstado() {
        if (podre.equalsIgnoreCase("S")) {
            return "A fruta está podre. Jogue fora!";
        } else {
            return "A fruta está boa. Pode comer!";
        }
    }
}
