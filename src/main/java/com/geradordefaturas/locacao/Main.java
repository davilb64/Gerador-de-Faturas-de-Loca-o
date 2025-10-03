package com.geradordefaturas.locacao;

import com.geradordefaturas.locacao.util.ScreenController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ScreenController.setStage(stage);
        stage.setTitle("Nova Serviços");
        ScreenController.changeScene("/view/MenuView.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
