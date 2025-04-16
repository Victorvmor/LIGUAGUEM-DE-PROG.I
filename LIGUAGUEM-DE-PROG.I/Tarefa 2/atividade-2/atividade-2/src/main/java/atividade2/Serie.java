package atividade2;
import java.util.Scanner;

public class Serie {
    private String NomeSerie;
    private String autor;
    private int anoLancamento;
    private String Atorfavorito1;
    private String Atorfavorito2;
    private String Atorfavorito3;

    // Construtor para inicializar os atributos
    public Serie() {
        this.NomeSerie = "";
        this.autor = "";
        this.anoLancamento = 0;
        this.Atorfavorito1 = "";
        this.Atorfavorito2 = "";
        this.Atorfavorito3 = "";
    }

    // Métodos para obter informações do teclado
    public void inserirDados(Scanner entrada) {
        System.out.println("Digite o nome da série: ");
        this.NomeSerie = entrada.nextLine();

        System.out.println("Digite o autor da série: ");
        this.autor = entrada.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        this.anoLancamento = entrada.nextInt();
        entrada.nextLine();  // Limpa o buffer do scanner

        System.out.println("Digite o nome do ator favorito 1: ");
        this.Atorfavorito1 = entrada.nextLine();

        System.out.println("Digite o nome do ator favorito 2: ");
        this.Atorfavorito2 = entrada.nextLine();

        System.out.println("Digite o nome do ator favorito 3: ");
        this.Atorfavorito3 = entrada.nextLine();
    }

    // Getters
    public String getNomeSerie() {
        return NomeSerie;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getAtorfavorito1() {
        return Atorfavorito1;
    }

    public String getAtorfavorito2() {
        return Atorfavorito2;
    }

    public String getAtorfavorito3() {
        return Atorfavorito3;
    }

    // Método para exibir informações da série
    public void exibirSerie() {
        System.out.println("------------------------");
        System.out.println("Informações da Série: ");
        System.out.println("Nome da Série: " + getNomeSerie());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("------------------------");
    }

    // Método para exibir os atores
    public void exibirAtores() {
        System.out.println("Atores favoritos: ");
        System.out.println("1. " + getAtorfavorito1());
        System.out.println("2. " + getAtorfavorito2());
        System.out.println("3. " + getAtorfavorito3());
        System.out.println("------------------------");
    }
}
