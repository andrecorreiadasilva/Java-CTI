package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;

public class FiltroController {
    @FXML
    private TextField txtCep;
    @FXML
    private Button btnExibir;

    @FXML
    private void onExibirButtonClick() throws IOException {
        String cep = txtCep.getText().trim();

        if (cep.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Aviso");
            alert.setContentText("CEP não informado");
            alert.setHeaderText(null);
            alert.setGraphic(null);
            alert.showAndWait();
            return;
        }

        String apiURL = "https://viacep.com.br/ws/" + cep + "/json";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiURL))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(response.body());

                String log = (String) jsonObject.get("logradouro");
                String bai = (String) jsonObject.get("bairro");
                String loc = (String) jsonObject.get("localidade");
                String ddd = (String) jsonObject.get("ddd");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("exibicao-view.fxml"));
                Parent root = loader.load();

                ExibicaoController controllerE = loader.getController();

                controllerE.receberCep(cep, log, bai, loc, ddd);

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } else {
                System.out.println("Request failed: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
