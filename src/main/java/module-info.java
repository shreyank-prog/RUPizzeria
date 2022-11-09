module com.example.finalrupizzeria {
    requires javafx.controls;
    requires javafx.fxml;


    opens Project4 to javafx.fxml;
    exports Project4;
}