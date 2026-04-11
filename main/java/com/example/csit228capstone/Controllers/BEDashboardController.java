package com.example.csit228capstone.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BEDashboardController {

    @FXML
    private ComboBox<String> dashboardbudgetDWM;
    @FXML
    private TextField dbbudgettextfield;


    @FXML
    public void initialize() {
        //combobox budget type
        dashboardbudgetDWM.getItems().addAll("Daily", "Weekly", "Monthly");
    }

    //gets the combo box value
    @FXML
    protected void dbbudgettype() {
        String dbtype = dashboardbudgetDWM.getValue();
        if (dbtype == null) return;
    }

    /*
    gets the textfield amount as "String" converted into int
    and prints the type along with textfield
    .getValue();
    */

    @FXML
    protected void dbbamount() {
        String dbtype = dashboardbudgetDWM.getValue();
        String text = dbbudgettextfield.getText();
        if (text == null || text.isEmpty()) return;
        try {
            int amount = Integer.parseInt(text);
            System.out.println("Amount: " + amount);
            System.out.println("Budget Type: " + dbtype);
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        }
    }




}
