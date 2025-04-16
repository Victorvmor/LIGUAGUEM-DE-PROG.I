package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class TelaFrutaController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtPodre;

    @FXML
    private TextArea resultado;

    @FXML
    private Button btnVerificar;

    @FXML
    void verificarFruta() {
        String nome = txtNome.getText();
        String cor = txtCor.getText();
        String podre = txtPodre.getText();

        Fruta fruta = new Fruta(nome, cor, podre);
        resultado.setText(fruta.verificarEstado());
    }
}
