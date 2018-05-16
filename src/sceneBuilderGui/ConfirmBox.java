package sceneBuilderGui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sceneBuilderGui.fxmlResources.MenuApplication;

public class ConfirmBox {

    public static void display ( String title, String message ) {

        Stage confirmBox = new Stage() ;
        confirmBox.initModality(Modality.APPLICATION_MODAL);
        confirmBox.setTitle(title);

        Label question = new Label(message);
        Button yesButton = new Button("Yes");
        yesButton.setAlignment(Pos.CENTER);
        Button noButton = new Button("No");
        noButton.setAlignment(Pos.CENTER);

        yesButton.setOnAction(e-> {
            confirmBox.close();
            Platform.exit();
        });
        noButton.setOnAction(e-> confirmBox.close());

        VBox pane = new VBox();
        HBox buttons = new HBox();

        buttons.getChildren().addAll(yesButton, noButton);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(10,10,10,10));
        buttons.setSpacing(20.0);
        pane.setSpacing(20.0);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(question,buttons);
        confirmBox.setScene(new Scene(pane,300,100));
        confirmBox.setResizable(false);
        confirmBox.showAndWait();


    }

}
