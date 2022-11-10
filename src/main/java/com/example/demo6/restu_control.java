package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class restu_control {

    @FXML
    private TextField food_sold_perday;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private Label result;

    @FXML
    void calculate(MouseEvent event) {
        restu obj = new restu(name.getText(), id.getText(), Integer.parseInt(food_sold_perday.getText()), Integer.parseInt(price.getText()));
        result.setText(obj.name+"'"+"s total income is "+Integer.toString(obj.calc_income())+"Taka");
    }

}
