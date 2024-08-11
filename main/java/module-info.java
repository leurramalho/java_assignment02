module ca.georgian.apistarwars {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens ca.georgian.apistarwars to javafx.fxml;
    exports ca.georgian.apistarwars;
}