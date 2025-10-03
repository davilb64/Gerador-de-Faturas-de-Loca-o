package controller.equipamentos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VerEquipamentoView {
    @FXML
    private TextField txtSKU;


    @FXML
    private void salvar() {
        Stage stage = (Stage) txtSKU.getScene().getWindow();
        stage.close();
    }

}
