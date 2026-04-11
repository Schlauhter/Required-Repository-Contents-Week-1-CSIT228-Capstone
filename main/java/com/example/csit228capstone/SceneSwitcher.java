package com.example.csit228capstone;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class SceneSwitcher {

    /*

    Kani nga class is para ni ma reuse for navigate through the scenes

    Ibutang lang ning code sa ubos nga naka comment sa controller on one of the buttons then change
    what fxml files u want to show when the button is clicked.

    @FXML
    private void goToDashboard(ActionEvent event) throws IOException {
    SceneSwitcher.switchScene(event, "dashboard.fxml");


    */

    public static void switchScene(ActionEvent event, String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(SceneSwitcher.class.getResource(fxmlFile));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
