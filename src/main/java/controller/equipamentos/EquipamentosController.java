package controller.equipamentos;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import util.ScreenController;

import java.io.IOException;

public class EquipamentosController {
    public void abrirModalEquipamento() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/EquipamentoFormView.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Criação/Edição de Equipamento");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void abrirVerEquipamento() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/VerEquipamentoView.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Criação/Edição de Equipamento");
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
