package atividade2;

import java.util.Scanner;

  public class Livro {
    private String nome;
    private String cor;
    private int numPaginas;
    private String tipo;

    // Construtor
    public Livro(String nome, String cor, int numPaginas, String tipo) {
        this.nome = nome;
        this.cor = cor;
        this.numPaginas = numPaginas;
        this.tipo = tipo;
    }

    // Método para mostrar as informações do livro
    public void mostrarInformacoes() {
        System.out.println("Nome do livro: " + nome);
        System.out.println("Cor do livro: " + cor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Tipo de livro: " + tipo);
    }

    // Método para avaliar o livro
    public void avaliarLivro(Scanner entrada) {
        System.out.println("Qual a sua avaliação para o livro (de 1 a 5)?");
        int avaliacao = entrada.nextInt();
        entrada.nextLine();  // Limpar o buffer do Scanner
        System.out.println("Você avaliou o livro com nota: " + avaliacao);
    }

    // Método para alterar o status de leitura (se está lendo ou não)
    public void alterarStatusLeitura(Scanner entrada) {
        System.out.println("Você está lendo o livro? [S/N]");
        String status = entrada.nextLine();
        if (status.equalsIgnoreCase("S")) {
            System.out.println("Você está lendo o livro.");
        } else {
            System.out.println("Você não está lendo o livro no momento.");
        }
    }

    // Método que executa as interações com o livro
    public void interagirComLivro(Scanner entrada) {
        mostrarInformacoes();
        avaliarLivro(entrada);
        alterarStatusLeitura(entrada);
    }
}
