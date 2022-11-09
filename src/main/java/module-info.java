module com.example.finalrupizzeria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalrupizzeria to javafx.fxml;
    exports com.example.finalrupizzeria;
}