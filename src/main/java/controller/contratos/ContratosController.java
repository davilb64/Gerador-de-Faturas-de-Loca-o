package controller.contratos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import util.ScreenController;

import java.io.IOException;

public class ContratosController {
    public void abrirModalContrato() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ContratoForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Criação de Contrato");
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
