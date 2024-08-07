module ca.georgian.apistarwars {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgian.apistarwars to javafx.fxml;
    exports ca.georgian.apistarwars;
}