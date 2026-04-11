module com.example.csit228capstone {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.example.csit228capstone to javafx.fxml;
    exports com.example.csit228capstone;
    exports com.example.csit228capstone.Controllers;
    opens com.example.csit228capstone.Controllers to javafx.fxml;
    exports com.example.csit228capstone.Applications;
    opens com.example.csit228capstone.Applications to javafx.fxml;
}