package ca.georgian.apistarwars;
// Imports
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

// Controller class
public class s1Controller {
    //FX objects from S1 Form
    @FXML
    private Label nameLabel;
    @FXML
    private Label heightLabel;
    @FXML
    private Label massLabel;
    @FXML
    private Label hairColorLabel;
    @FXML
    private Label skinColorLabel;
    @FXML
    private Label eyeColorLabel;
    @FXML
    private Label birthYearLabel;
    @FXML
    private Label genderLabel;

    //Method to show person object data
    public void showPerson(Person person) {
        //writing FM objects
        nameLabel.setText(person.getName());
        heightLabel.setText(person.getHeight());
        massLabel.setText(person.getMass());
        hairColorLabel.setText(person.getHair_color());
        skinColorLabel.setText(person.getSkin_color());
        eyeColorLabel.setText(person.getEye_color());
        birthYearLabel.setText(person.getBirth_year());
        genderLabel.setText(person.getGender());
    }

    @FXML
    // Method to close window in S1.
    public void onMoveBack() {
        Stage stage = (Stage) nameLabel.getScene().getWindow();
        stage.close();
    }
}
