package Project4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RUPizzeriaMain extends Application {
    @Override
    public void start(Stage mainStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RUPizzeriaMain.class.getResource("MainView.fxml"));
        Scene mainScene = new Scene(fxmlLoader.load(), 582, 573);
        mainStage.setTitle("RU Pizzeria");
        mainStage.setScene(mainScene);
        mainStage.show();

        Stage chicagoStage = new Stage();
        FXMLLoader fxmlLoader1 = new FXMLLoader(RUPizzeriaMain.class.getResource("ChicagoStyleOrderingView.fxml"));
        Scene chicagoScene = new Scene(fxmlLoader1.load(), 554, 525);
        chicagoStage.setTitle("Chicago Style Pizza");
        chicagoStage.setScene(chicagoScene);
        chicagoStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}