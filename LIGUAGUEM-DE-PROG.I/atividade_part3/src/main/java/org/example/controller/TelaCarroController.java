package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaCarroController {

    @FXML private TextField txtNome;
    @FXML private TextField txtMarca;
    @FXML private Label lblStatus;

    private Carro carro;

    @FXML
    public void ligarCarro(ActionEvent event) {
        if (carro == null) {
            carro = new Carro(txtNome.getText(), txtMarca.getText(), false);
        }
        carro.ligarCarro();
        lblStatus.setText("Carro ligado!");
    }

    @FXML
    public void acelerarCarro(ActionEvent event) {
        if (carro != null && carro.getLigado()) {
            carro.acelerar(10, 120);
            lblStatus.setText("Acelerando...");
        } else {
            lblStatus.setText("O carro precisa estar ligado.");
        }
    }

    @FXML
    public void freiarCarro(ActionEvent event) {
        if (carro != null && carro.getLigado()) {
            carro.freiar(10);
            lblStatus.setText("Freiando...");
        } else {
            lblStatus.setText("O carro precisa estar ligado.");
        }
    }
}
