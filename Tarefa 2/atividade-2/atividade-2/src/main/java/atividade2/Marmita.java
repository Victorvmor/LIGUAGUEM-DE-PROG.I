package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class Marmita {
    private String nomeMarmita;
    private ArrayList<String> Ingredientes = new ArrayList<>();
    private String acompanhamento;

    public String getnomeMarmita() {
        return nomeMarmita;
    }



    public void setnomeMarmita(String nomeMarmita) {
        this.nomeMarmita = nomeMarmita;
    }

    public void adicionarIngredientes(Scanner entrada){
        String op = "S";
        while(op.equalsIgnoreCase("S")){
            System.out.println("Digite o nome do ingrediente: ");
            String nomeIngrediente = entrada.nextLine();

            // Adiciona o ingrediente na lista
            Ingredientes.add(nomeIngrediente);

            //Perguntando se deseja continuar
            System.out.println("Deseja adicionar outro ingrediente? [S/N]");
            op = entrada.nextLine().toUpperCase();
        }
    }

    public void exibirIngredientes(){
        for(String ingrediente : Ingredientes){
            System.out.println(ingrediente);
        }
    }
    public void finalizarMarmita(String acompanhamento){
        this.acompanhamento = acompanhamento;
        System.out.println("Finalizando a marmita "+ getnomeMarmita() );
    }



}




