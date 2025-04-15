package org.example.controller;

public class Carro {
    private String nome;
    private String marca;
    private boolean ligado;

    public Carro(String nome, String marca, boolean ligado){
        this.nome = nome;
        this.marca = marca;
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    public void ligarCarro(){

        if(ligado != true){
            System.out.println("Ligando carro!");
            this.ligado = true;
        }else{
            System.out.println("O carro já está ligado!");
        }

    }
    public void acelerar(int incremento, int limiteVelocidade) {
        if (this.ligado) {
            System.out.println("Acelerando...");

        }
    }

    public void freiar(int discremento){
        if(this.ligado){
            System.out.println("Freiando...");

        }
    }
}
