package atividade2;

import java.util.Scanner;

public class Planta {
    private String nome;
    private String tipo;
    private String cor;
    private int nivelAgua;

    public Planta(String nome, String tipo, String cor){
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public int getNivelAgua(){
        return nivelAgua;
    }

   public int verificarONivelAgua(Scanner entrada){
       System.out.println("Qual o nível de agua da planta?");
        int nivel = entrada.nextInt();
        this.nivelAgua = nivel;
        return nivel;
   }
    public void regar(Scanner entrada){
        System.out.println(getNome() + " precisa de agua!" );
        System.out.println("Encher até o nível: ");
        int nivel = entrada.nextInt();
        this.nivelAgua = nivel;
        System.out.println("A planta está no nível de água: " + getNivelAgua());
    }

    public void mostrarInformacaoPlanta() {
        System.out.println("---------------");
        System.out.println("Flor: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cor: " + getCor());
        System.out.println("Nível de água: " + getNivelAgua());
        System.out.println(" ");
        System.out.println("Desrição do tipo de Flor 🌱: ");
        if(this.tipo.equalsIgnoreCase("Camomila")){
            System.out.println(getTipo().toUpperCase()+ ": " + " Usada para aliviar problemas digestivos e promover o relaxamento.!");
        }
        else if(this.tipo.equalsIgnoreCase("Lavanda")){
            System.out.println(getTipo().toUpperCase() + ": " + " Tem propriedades calmantes e é usada para tratar insônia e ansiedade.!");
        }
        else if(this.tipo.equalsIgnoreCase("Girassol")){
            System.out.println(getTipo().toUpperCase() + ": " + "Conhecido por sua grandeza e pela atração de polinizadores como abelhas.!");
        }
        else if ( this.tipo.equalsIgnoreCase("Rosa")) {
            System.out.println(getTipo().toUpperCase() + ": " + "Símbolo de amor e beleza, é frequentemente usada em cosméticos e perfumes.! ");
        }
        System.out.println("---------------");
        System.out.println("");
    }
}
