package sceneBuilderGui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class CustDataController {


    @FXML
    private WelcomeController welcomeController ;

    @FXML
    private TextField surnameField, emailField, nameField;

    @FXML
    private Button bookButton;

    @FXML
    private BorderPane customerData;

    @FXML
    private DatePicker reservDate;

}
