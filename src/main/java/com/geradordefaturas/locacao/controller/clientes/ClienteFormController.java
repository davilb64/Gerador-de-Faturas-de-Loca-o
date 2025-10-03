package com.geradordefaturas.locacao.controller.clientes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ClienteFormController {

    @FXML private TextField txtNome;

    private boolean confirmado = false;

    public void abrirModalEndereco() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/EnderecoForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Novo Endereco");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void salvar() {
        confirmado = true;
        fechar();
    }

    @FXML
    private void cancelar() {
        confirmado = false;
        fechar();
    }

    private void fechar() {
        Stage stage = (Stage) txtNome.getScene().getWindow();
        stage.close();
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
