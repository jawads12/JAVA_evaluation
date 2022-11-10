package com.example.demo6;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class start {

    @FXML
    void rest(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(start.class.getResource("restu.fxml"));
        Parent pane = loader.load();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void school(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(start.class.getResource("school.fxml"));
        Parent pane = loader.load();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }

}
