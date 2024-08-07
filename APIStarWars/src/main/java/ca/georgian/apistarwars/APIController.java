package ca.georgian.apistarwars;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class APIController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onDataButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}