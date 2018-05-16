package sceneBuilderGui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sceneBuilderGui.ConfirmBox;
import sceneBuilderGui.fxmlResources.MenuApplication;

public class RestDataController {

    @FXML
    private Button exitButton, catalogueButton;

    @FXML
    private BorderPane restaurantData;

    @FXML private WelcomeController welcomeController ;


    @FXML
    private void showCatalogue(ActionEvent event) {

    }

    @FXML
    private void exitProgram(ActionEvent event) {

        MenuApplication.exit();

    }

}
