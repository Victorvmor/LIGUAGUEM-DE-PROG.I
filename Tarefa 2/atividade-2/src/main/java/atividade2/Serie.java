package atividade2;

import java.util.Scanner;

public class Serie {
    private String NomeSerie;
    private String autor;
    private int anoLancamento;
    private String Atorfavorito1;
    private String Atorfavorito2;
    private String Atorfavorito3;

    public Serie (String NomeSerie, String autor, int anoLancamento, String atorfavorito1) {
        this.NomeSerie = NomeSerie;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.Atorfavorito1 = "";
        this.Atorfavorito2 = "";
        this.Atorfavorito3 = "";
    }

    public Serie(String roundSix, String autor, int anoLancamento) {
    }


    public String getNomeSerie() {return getNomeSerie();}
    public String getAutor(){
       return autor;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    private String getAtorfavorito1() {return Atorfavorito1;}
    public String getAtorfavorito2() {return Atorfavorito2;}
    public String getAtorfavorito3() {
        return Atorfavorito3;
    }

    
    
    public void setAtorfavorito1(String atorfavorito1) {
       this.Atorfavorito1 = atorfavorito1;
    }



    public void setAtorfavorito2(String atorfavorito2) {
        this.Atorfavorito2 = atorfavorito2;
    }

    public void setAtorfavorito3(String atorfavorito3) {
        this.Atorfavorito3 = atorfavorito3;
    }

    public void exibirSerie(){
        System.out.println("------------------------");
        System.out.println("Informações da Serie: ");
        System.out.println("Nome da Serie: " + getNomeSerie());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("------------------------");
    }

    public void inserirAtor(Scanner entrada){
        //A suprema arte da guerra é derrotar o inimigo sem lutar.
        System.out.println("Insira primeira citação: ");
        setAtorfavorito1(entrada.nextLine());

        //As oportunidades multiplicam-se à medida que são agarradas.
        System.out.println("Insira segunda citação: ");
        setAtorfavorito2(entrada.nextLine());

        //Diante de uma larga frente de batalha, procure o ponto mais fraco e, ali, ataque com a sua maior força.
        System.out.println("Insira terceira citação: ");
        setAtorfavorito3(entrada.nextLine());

        System.out.println("");
    }

    public void exibirAtores(Scanner entrada){
        System.out.println("Escolha um número para mostraro ator de 1 a 3: ");
        int op = entrada.nextInt();
        entrada.nextLine();
        System.out.println("O ator favorito escolhido : " + op);
        switch (op){
            case 1:
                System.out.println("'"+ getAtorfavorito1() + "'");
                break;
            case 2:
                System.out.println("'" + getAtorfavorito2()+ "'");
                break;
            case 3:
                System.out.println("'" + getAtorfavorito3() + "'");
                break;
        }
        System.out.println("------------------------");
    }


}

