package org.example.controller;

import org.example.Animal;  // Importando a classe Animal

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaAnimalController {

    // FXML com TextFields para editar os atributos do Animal
    @FXML
    private TextField txtEspecie;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtTipo;
    @FXML
    private TextField txtIdade;
    @FXML
    private TextField txtCostume;

    // Labels para mostrar os valores do animal
    @FXML
    private Label labelEspecie;
    @FXML
    private Label labelNome;
    @FXML
    private Label labelTipo;
    @FXML
    private Label labelIdade;
    @FXML
    private Label labelCostume;

    // Botões de interação
    @FXML
    private Button btnBeber;
    @FXML
    private Button btnMovimentar;
    @FXML
    private Button btnComer;

    private Animal animal;

    // Método para inicializar a tela
    @FXML
    public void initialize() {
        // Definir um animal inicial de exemplo
        animal = new Animal("Leão", "Simba", "Felino", 5, "Caçar", "Andando");

        // Exibir informações do animal no inicio
        labelEspecie.setText("Espécie: " + animal.getEspecie());
        labelNome.setText("Nome: " + animal.getNome());
        labelTipo.setText("Tipo: " + animal.getTipo());
        labelIdade.setText("Idade: " + animal.getIdade());
        labelCostume.setText("Costume: " + animal.getCostume());
    }

    // Método para criar o animal baseado nas entradas do usuário
    @FXML
    public void criarAnimal() {
        // Criar o animal com os dados inseridos nos TextFields
        String especie = txtEspecie.getText();
        String nome = txtNome.getText();
        String tipo = txtTipo.getText();
        int idade = Integer.parseInt(txtIdade.getText());  // Converter para int
        String costume = txtCostume.getText();

        animal = new Animal(especie, nome, tipo, idade, costume, "Andando");

        // Exibir as informações do novo animal
        labelEspecie.setText("Espécie: " + animal.getEspecie());
        labelNome.setText("Nome: " + animal.getNome());
        labelTipo.setText("Tipo: " + animal.getTipo());
        labelIdade.setText("Idade: " + animal.getIdade());
        labelCostume.setText("Costume: " + animal.getCostume());
    }

    // Método para simular o comportamento de beber do animal
    @FXML
    public void beberAnimal() {
        animal.beber();
    }

    // Método para simular o movimento do animal
    @FXML
    public void movimentarAnimal() {
        animal.movimentar();  // Corrigido com ponto e vírgula
    }
