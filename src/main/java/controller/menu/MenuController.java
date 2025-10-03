package controller.menu;

import javafx.fxml.FXML;
import util.ScreenController;

public class MenuController {
    @FXML
    private void entrarClientes() {
        ScreenController.changeScene("/view/ClientesView.fxml");
    }
    @FXML
    private void entrarVendedores() {
        ScreenController.changeScene("/view/VendedoresView.fxml");
    }
    @FXML
    private void entrarEquipamentos() {
        ScreenController.changeScene("/view/EquipamentosView.fxml");
    }
    @FXML
    private void entrarContratos() {
        ScreenController.changeScene("/view/ContratosView.fxml");
    }
    @FXML
    private void entrarFaturas() {
        ScreenController.changeScene("/view/FaturasView.fxml");
    }
    @FXML
    private void entrarFichas() {
        ScreenController.changeScene("/view/FichasView.fxml");
    }

}
