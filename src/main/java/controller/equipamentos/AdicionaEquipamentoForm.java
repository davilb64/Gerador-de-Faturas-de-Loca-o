package controller.equipamentos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdicionaEquipamentoForm {
    @FXML
    private TextField txtQuantidade;

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
        Stage stage = (Stage) txtQuantidade.getScene().getWindow();
        stage.close();
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
