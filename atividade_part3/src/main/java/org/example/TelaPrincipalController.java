package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TelaPrincipalController {

    @FXML
    private Button btmTimeBasquete;

    @FXML
    void trocarTelaTimeBasquete(ActionEvent event) throws IOException {
                App.setRoot("telaTimeBasquete");
    }

}
