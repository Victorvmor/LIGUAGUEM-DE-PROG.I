package atividade2;

import java.util.Scanner;

public class Fruta {
    private String nome;
    private String cor;
    private String tipo;
    private String comer;  // Indica se a fruta pode ser comida
    private String podre;  // Indica se a fruta está podre (vai ser definido pelo usuário)

    // Construtor
    public Fruta(String nome, String cor, String tipo, String comer) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
        this.comer = comer;  // Se "S", indica que pode ser comida
        this.podre = "N";  // Inicialmente, a fruta não é podre
    }

    // Método para perguntar se a fruta está podre
    public void verificarEstado(Scanner entrada) {
        System.out.println("A fruta " + nome + " está podre? [S/N]");
        this.podre = entrada.nextLine().toUpperCase();  // Lê a entrada do usuário

        if (this.podre.equals("S")) {
            System.out.println("A fruta está podre!");
            jogarlixo();  // Se estiver podre, joga fora
        } else {
            System.out.println("A fruta não está podre. Pode comer.");
            comer(entrada);  // Se não estiver podre, pergunta se pode comer
        }
    }

    // Método para perguntar se a fruta deve ser comida
    public void comer(Scanner entrada) {
        // Pergunta ao usuário se quer comer a fruta
        System.out.println("Comer a fruta? [S/N]");
        String decisaoComer = entrada.nextLine();  // Lê a decisão do usuário
        if (decisaoComer.equalsIgnoreCase("S")) {
            System.out.println("Comendo a fruta...");
        } else {
            System.out.println("Não comeu a fruta...");
        }
    }

    // Método para jogar a fruta fora caso esteja podre
    public void jogarlixo() {
        if (this.podre.equals("S")) {
            System.out.println("Jogando fora...");
        }
    }

    // Método para exibir o estado da fruta
    public void estado() {
        if (podre.equals("S")) {
            System.out.println("Está podre!");
        } else {
            System.out.println("Pode comer...");
        }
    }
}
