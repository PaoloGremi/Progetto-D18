package sceneBuilderGui;

import javafx.application.Platform;
import javafx.scene.control.Button;

public class ExitConfirmBox extends ConfirmBox{

    public ExitConfirmBox() {
        super("Exit confirm required", " Are you sure you want to exit?", 300,200);
    }

    @Override
    public void setActions(Button yesButton, Button noButton) {

        yesButton.setOnAction(e -> {
            e.consume();
            Platform.exit();

        });

        noButton.setOnAction(e -> getConfirmBox().close());

    }
}
