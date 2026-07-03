package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ExibicaoController {
    @FXML
    private Label lblCep;
    @FXML
    private Label lblLog;
    @FXML
    private Label lblBai;
    @FXML
    private Label lblLoc;
    @FXML
    private Label lblDdd;

    public void receberCep(String cep, String log,
                           String bairro, String loc, String ddd) {
        lblCep.setText("CEP: "+cep);
        lblLog.setText("Logradouro: "+log);
        lblBai.setText("Bairro: "+bairro);
        lblLoc.setText("Localidade: "+loc);
        lblDdd.setText("DDD: "+ddd);

    }
}
