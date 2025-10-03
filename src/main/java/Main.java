import util.ScreenController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ScreenController.setStage(stage);
        stage.setTitle("Nova Serviços");
        ScreenController.changeScene("/view/MenuView.fxml");
    }

}
