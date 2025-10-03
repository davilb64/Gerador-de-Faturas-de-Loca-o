package controller.fichas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import util.ScreenController;

import java.io.IOException;

public class FichasController {
    public void abrirModalFicha() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FichaFormView.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Vizualização de Ficha");
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
