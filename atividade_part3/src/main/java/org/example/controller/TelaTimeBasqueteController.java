package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaTimeBasqueteController {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField cestasTimeCasa;

    @FXML
    private TextField cestasTimeVisitante;

    @FXML
    private AnchorPane placar;

    @FXML
    private TextField resultadoJogo;

    @FXML
    private TextField timeCasa;

    @FXML
    private TextField timeVisitante;

    @FXML
    private TextArea txtArea;

    TimeBasquete novaPartida;

    @FXML
    void enviarPlacar(ActionEvent event) {
        String casa = timeCasa.getText();
        String visitante = timeVisitante.getText();
        Integer cestaCasa = Integer.parseInt(cestasTimeCasa.getText());
        Integer cestaVisitante = Integer.parseInt(cestasTimeVisitante.getText());

        novaPartida = new TimeBasquete(casa, visitante, cestaCasa, cestaVisitante );

        if (novaPartida.getCestasCasa() > novaPartida.getCestasVisitante()){
            txtArea.setText("O "+ novaPartida.getTimeCasa() + " ganhou a partida!");
        } else if (novaPartida.getCestasCasa() < novaPartida.getCestasVisitante()){
            txtArea.setText("O "+ novaPartida.getTimeVisitante() + " ganhou a partida!");
        } else {
            txtArea.setText("Empate!");
        }


    }

}
