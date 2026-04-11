package com.example.csit228capstone.Applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BEDashboardApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BETrackerLoginApplication.class.getResource("/com/example/view/Dashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
        stage.setResizable(false);
        stage.setTitle("Budget / Expenses Tracker");
        stage.setScene(scene);
        stage.show();
    }
}
