package ca.georgian.apistarwars;

//Imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class APIApplication extends Application {
    private static Stage stage;
    private static Scene S0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //code to open first form - S0.
        stage = primaryStage;
        stage.setTitle("StarWars Characters");

        Parent fxmS0 = FXMLLoader.load(getClass().getResource("S0.fxml"));
        S0 = new Scene(fxmS0);

        stage.setScene(S0);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}