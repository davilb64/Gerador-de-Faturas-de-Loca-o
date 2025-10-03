package controller.clientes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VerClienteController {
    @FXML private Label lblTipoPessoa;
    public void salvar() {
        Stage stage = (Stage) lblTipoPessoa.getScene().getWindow();
        stage.close();
    }
}
