package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TelaPrincipalController {

    @FXML
    private Button btmTimeBasquete;  // Botão já existente
    @FXML
    private Button btmCarro;  // Botão para a tela do Carro
    @FXML
    private Button btmFruta;  // Botão para a tela de Frutas
    @FXML
    private Button btmAnimal;  // Botão para a tela de Animal (novo)

    @FXML
    void trocarTelaTimeBasquete(ActionEvent event) throws IOException {
        App.setRoot("telaTimeBasquete");  // Troca para a tela de Time de Basquete
    }

    @FXML
    void trocarTelaCarro(ActionEvent event) throws IOException {
        App.setRoot("telaCarro");  // Troca para a tela de Carro
    }

    @FXML
    void trocarTelaFruta(ActionEvent event) throws IOException {
        App.setRoot("telaFruta");  // Troca para a tela de Fruta
    }

    // Método para abrir a tela de Animal
    @FXML
    void trocarTelaAnimal(ActionEvent event) throws IOException {
        App.setRoot("telaAnimal");  // Troca para a tela de Animal
    }
}
