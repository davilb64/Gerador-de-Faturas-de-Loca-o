package com.geradordefaturas.locacao.controller.clientes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import com.geradordefaturas.locacao.util.ScreenController;

import java.io.IOException;

public class ClientesController {

    public void abrirModalCliente() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ClienteForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Cadastro de Cliente");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void abrirModalVerCliente() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/VerClienteView.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Cliente");
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
