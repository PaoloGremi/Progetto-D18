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

public abstract class ConfirmBox {

    private Stage confirmBox ;
    private Scene scene ;
    private VBox pane ;
    private HBox buttons ;
    private Button yesButton, noButton ;
    private Label question ;

    public ConfirmBox(String title, String message, double width, double height){

        confirmBox = new Stage() ;
        confirmBox.setTitle(title);

        pane = new VBox();
        buttons = new HBox();
        question = new Label(message);
        yesButton = new Button("Yes");
        noButton = new Button("No");

        setConstraints();

        buttons.getChildren().addAll(yesButton, noButton);
        pane.getChildren().addAll(question,buttons);
        confirmBox.setScene(new Scene(pane,width,height));

    }

    public void show () {

        try {
            setActions(this.yesButton, this.noButton);
            confirmBox.showAndWait();
        }
        catch(Exception e){}
    }

    public Stage getConfirmBox() {
        return confirmBox;
    }

    public abstract void setActions(Button yesButton, Button noButton);

    private void setConstraints(){

        noButton.setAlignment(Pos.CENTER);
        yesButton.setAlignment(Pos.CENTER);

        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(10,10,10,10));
        buttons.setSpacing(20.0);

        pane.setSpacing(20.0);
        pane.setAlignment(Pos.CENTER);

        confirmBox.initModality(Modality.APPLICATION_MODAL);
        confirmBox.setResizable(false);


    }

}
