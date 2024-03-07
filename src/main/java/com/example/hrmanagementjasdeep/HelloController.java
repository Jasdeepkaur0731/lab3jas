package com.example.hrmanagementjasdeep;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Button hbt;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    public void login(ActionEvent actionEvent) {
        try {
            Parent secondScene =
                    FXMLLoader.load(getClass().getResource("dashview-view.fxml"));
            Stage secondStage = new Stage();
            secondStage.setTitle("User Scene");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) hbt.getScene().getWindow();
            firstSceneStage.close();
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
