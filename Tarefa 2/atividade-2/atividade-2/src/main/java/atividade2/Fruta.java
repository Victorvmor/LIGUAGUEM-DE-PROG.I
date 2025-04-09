package atividade2;

import java.util.Scanner;

public class Fruta {
    private String nome;  // Atributo alterado para minúsculo, conforme a convenção Java
    private String cor;
    private String tipo;
    private String comer;  // Atributo que indica se a fruta pode ser comida
    private String podre;  // Atributo que indica se a fruta está podre

    // Construtor
    public Fruta(String nome, String cor, String tipo, String comer, String podre) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
        this.comer = comer;
        this.podre = podre;
    }

    // Método para verificar o estado da fruta
    public void estado() {
        if (podre.equals("S")) {
            System.out.println("Está podre!");
            jogarlixo();
        } else {
            System.out.println("Pode comer...");
        }
    }

    // Método para perguntar se a fruta deve ser comida
    public void comer(Scanner entrada) {
        if (comer.equals("S")) {
            System.out.println("Comer a fruta? [S/N] ");
            String decisaoComer = entrada.nextLine();
            if (decisaoComer.equalsIgnoreCase("S")) {
                System.out.println("Comendo a fruta...");
            } else {
                System.out.println("Não comeu...");
            }
            System.out.println();  // Pula linha após a decisão
        }
    }

    // Método para jogar a fruta fora caso esteja podre
    public void jogarlixo() {
        if (this.podre.equals("S")) {
            System.out.println("Jogando fora...");
        }
    }
}
