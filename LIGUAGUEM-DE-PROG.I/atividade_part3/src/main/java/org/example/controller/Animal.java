package org.example;

public class Animal {

    private String especie;         // "especie" ao invés de "animal", que é muito genérico
    private String nome;
    private String tipo;
    private int idade;
    private String costume;
    private String movimento;

    // Construtor para inicializar todos os atributos
    public Animal(String especie, String nome, String tipo, int idade, String costume, String movimento) {
        this.especie = especie;
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.costume = costume;
        this.movimento = movimento;
    }

    // Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCostume() {
        return costume;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    // Método toString para mostrar informações do animal
    @Override
    public String toString() {
        return "-------------\n" +
                "Espécie: " + getEspecie() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Costume: " + getCostume() + "\n" +
                "-------------";
    }

    // Métodos para comportamentos do animal
    public void beber() {
        System.out.println(getNome() + " está bebendo!");
    }

    public void movimentar() {
        System.out.println(getNome() + " está " + getMovimento() + "!");
    }
}
