module com.example.hrmanagementjasdeep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hrmanagementjasdeep to javafx.fxml;
    exports com.example.hrmanagementjasdeep;
}