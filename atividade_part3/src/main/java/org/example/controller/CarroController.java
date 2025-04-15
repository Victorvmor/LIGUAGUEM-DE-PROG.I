package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CarroController {

    @FXML
    private Button btnAcelerar;

    @FXML
    private Button btnFreiar;

    @FXML
    private Button btnligar;

    @FXML
    private Button enviarInfo;

    @FXML
    private TextField marcaCarro;

    @FXML
    private TextField nomeCarro;

    @FXML
    private AnchorPane txtArea;


   Carro novoCarro;



    @FXML
    void acelerarCarro(ActionEvent event) {

    }

    @FXML
    void enviarInfoCarro(ActionEvent event) {
    String nome = nomeCarro.getText();
    String marca = marcaCarro.getText();
    boolean ligado = true;

        novoCarro = new Carro(nome,marca,ligado);
    }

    @FXML
    void freiarCarro(ActionEvent event) {

    }

    @FXML
    void ligarCarro(ActionEvent event) {
        if(novoCarro.getLigado()!= true){
            txtArea.setText("Ligando carro!");
        }else{
            System.out.println("O carro já está ligado!");
        }


    }

}
