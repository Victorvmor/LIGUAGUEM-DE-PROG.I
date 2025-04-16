package org.example.controller;

import java.util.Scanner;

public class TimeBasquete {
    private String timeCasa;
    private String timeVisitante;
    private int CestasCasa;
    private int CestasVisitante;

    public TimeBasquete(String time, String rival, Integer CestaCasa, Integer CestaVisitante){
        this.timeCasa = time;
        this.timeVisitante = rival;
        this.CestasCasa = CestaCasa;
        this.CestasVisitante = CestaVisitante;
    }

    public String getTimeCasa() {
        return timeCasa;
    }


    public String getTimeVisitante() {
        return timeVisitante;
    }

    public int getCestasCasa() {
        return CestasCasa;
    }

    public int getCestasVisitante() {
        return CestasVisitante;
    }

    public void perguntarOPlacar(Scanner entrada){

        System.out.println("Quantas Cestas o "+ getTimeCasa()+ " tiveram na partida? ");
        setCestasCasa(entrada.nextInt());  // Correção: Usando o setter
        entrada.nextLine();
        System.out.println("Quantos Cesta o " + getTimeVisitante() + " tiveram na partida? ");
        setCestasVisitante(entrada.nextInt());  // Correção: Usando o setter

        if (getCestasCasa() > getCestasVisitante()){
            System.out.println("O "+ getTimeCasa() + " ganhou a partida!");
        } else if (getCestasCasa() < getCestasVisitante()){
            System.out.println("O "+ getTimeVisitante() + " ganhou a partida!");
        } else {
            System.out.println("Empate!");
        }

    }


    // Método setter para CestasCasa
    public void setCestasCasa(int CestasCasa) {
        this.CestasCasa = CestasCasa;
    }

    // Método setter para CestasVisitante
    public void setCestasVisitante(int CestasVisitante) {
        this.CestasVisitante = CestasVisitante;
    }



    public void mostrarPlacar(){
        System.out.println("------------------");
        System.out.println("PLACAR: \n" + getTimeCasa() + " X " + getTimeVisitante());
        System.out.println(getCestasCasa()+ " X " + getCestasVisitante());
        System.out.println("------------------");
    }

}