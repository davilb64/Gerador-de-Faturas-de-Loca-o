package com.geradordefaturas.locacao.controller.faturas;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FaturaFormController {
    @FXML
    private TextField txtContrato;

    private boolean confirmado = false;

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
        Stage stage = (Stage) txtContrato.getScene().getWindow();
        stage.close();
    }

    public boolean isConfirmado() {
        return confirmado;
    }

}
