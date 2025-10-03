package com.geradordefaturas.locacao.controller.equipamentos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EquipamentoFormController {
    @FXML
    private TextField txtSKU;

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
        Stage stage = (Stage) txtSKU.getScene().getWindow();
        stage.close();
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
