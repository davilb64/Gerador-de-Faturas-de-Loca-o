package controller.vendedor;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VendedorFormController {
    @FXML
    private TextField txtNome;

    private boolean confirmado = false;


    @FXML
    private void cancelar() {
        confirmado = false;
        fechar();
    }

    @FXML
    private void salvar() {
        confirmado = true;
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
