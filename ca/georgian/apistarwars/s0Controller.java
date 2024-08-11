package ca.georgian.apistarwars;
//Imports
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.util.List;

public class s0Controller {
    // FX objects
    @FXML
    private TextField txtFind;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> namePerson;
    private final ObservableList<Person> People = FXCollections.observableArrayList();
    private final SortedList<Person> sortedPeople = new SortedList<>(People);
    private final StarWarsService service = new StarWarsService();

    @FXML
    //starting
    public void initialize() {
        namePerson.setCellValueFactory(new PropertyValueFactory<>("name"));

        sortedPeople.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedPeople);
    }

    @FXML
    // Method to find data using StarWarsService
    protected void onFindClick() {
        String query = txtFind.getText();
        try {
            List<Person> people = service.toFindPerson(query); // get API data
            if (people.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("People not found.");
                alert.showAndWait();
            } else {
                ObservableList<Person> data = FXCollections.observableArrayList(people);
                tableView.setItems(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    // Method to show data to selected person.
    public void showDetail() {
        Person person = tableView.getSelectionModel().getSelectedItem();
        if (person != null) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("S1.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(fxmlLoader.load()));
                s1Controller controller = fxmlLoader.getController();
                controller.showPerson(person);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
