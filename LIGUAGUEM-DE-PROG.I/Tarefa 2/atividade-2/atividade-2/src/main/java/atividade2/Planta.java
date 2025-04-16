package atividade2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Planta {
    private String nome;
    private String tipo;
    private String cor;
    private int nivelAgua;

    // Mapa para armazenar as descrições das plantas com base no tipo
    private static final Map<String, String> descricoesTipoPlanta = new HashMap<>();

    // Construtor da planta
    public Planta(String nome, String tipo, String cor) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.nivelAgua = 0; // Inicializa o nível de água como 0 por padrão
    }

    // Inicializa as descrições das plantas
    static {
        descricoesTipoPlanta.put("Camomila", "Usada para aliviar problemas digestivos e promover o relaxamento.");
        descricoesTipoPlanta.put("Lavanda", "Tem propriedades calmantes e é usada para tratar insônia e ansiedade.");
        descricoesTipoPlanta.put("Girassol", "Conhecido por sua grandeza e pela atração de polinizadores como abelhas.");
        descricoesTipoPlanta.put("Rosa", "Símbolo de amor e beleza, é frequentemente usada em cosméticos e perfumes.");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    // Método para verificar o nível de água da planta
    public int verificarONivelAgua(Scanner entrada) {
        System.out.println("Qual o nível de água da planta? digite somente o numero de MLs");
        int nivel = entrada.nextInt();
        // Garantir que o nível de água seja não-negativo
        while (nivel < 0) {
            System.out.println("Nível de água não pode ser negativo. Tente novamente:");
            nivel = entrada.nextInt();
        }
        this.nivelAgua = nivel;
        return nivel;
    }

    // Método para regar a planta
    public void regar(Scanner entrada) {
        System.out.println(getNome() + " precisa de água!");
        System.out.println("Encher até o nível: ");
        int nivel = entrada.nextInt();
        // Garantir que o nível de água seja não-negativo
        while (nivel < 0) {
            System.out.println("Nível de água não pode ser negativo. Tente novamente:");
            nivel = entrada.nextInt();
        }
        this.nivelAgua = nivel;
        System.out.println("A planta está no nível de água: " + getNivelAgua());
    }

    // Exibir informações sobre a planta
    public void mostrarInformacaoPlanta() {
        System.out.println("---------------");
        System.out.println("Flor: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cor: " + getCor());
        System.out.println("Nível de água: " + getNivelAgua());
        System.out.println(" ");

        // Exibir descrição do tipo de planta, se disponível
        String descricao = descricoesTipoPlanta.get(getTipo());
        if (descricao != null) {
            System.out.println("Descrição do tipo de flor 🌱: ");
            System.out.println(getTipo().toUpperCase() + ": " + descricao);
        } else {
            System.out.println("Descrição não disponível para este tipo de planta.");
        }
        System.out.println("---------------");
        System.out.println("");
    }
}
