package com.geradordefaturas.locacao.controller.faturas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import com.geradordefaturas.locacao.util.ScreenController;

import java.io.IOException;

public class FaturasController {
    public void abrirModalFatura() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FaturaForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Criação de Fatura");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/view/MenuView.fxml");
    }
}
