package sceneBuilderGui.fxmlResources;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sceneBuilderGui.ConfirmBox;

public class MenuApplication extends Application{

    private static Stage window ;
    private Scene welcomePageScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent welcomePageRoot = FXMLLoader.load(getClass().getResource("Welcome_page1.fxml"));
        welcomePageScene = new Scene(welcomePageRoot,1000,700);
        window = primaryStage ;
        window.setScene(welcomePageScene);
        window.setOnCloseRequest(e->{
            e.consume();
            exit();
        });
        window.setResizable(false);
        window.show();

    }

    public static void exit(){

        ConfirmBox.display("Exit confirm", "Are you sure?");

    }
}
