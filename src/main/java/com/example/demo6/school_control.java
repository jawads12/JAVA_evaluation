package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class school_control {

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField no_of_stud;

    @FXML
    private Label result;

    @FXML
    private TextField tution;

    @FXML
    void calculate(MouseEvent event) {
        school obj = new school(name.getText(), id.getText(), Integer.parseInt(no_of_stud.getText()), Integer.parseInt(tution.getText()));
        result.setText(obj.name+"'"+"s total income is "+Integer.toString(obj.calc_income())+"Taka");

    }

}
