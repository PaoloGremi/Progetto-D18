package sceneBuilderGui.fxmlResources.menuCreation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class menuController {
    @FXML private CheckBox veganFlag, veggieFlag, celiacFlag;
    @FXML private Tab startersTab, firstTab, mainTab, dessertsTab, drinksTab;
    @FXML private Button setButton, nextButton, cancelButton;
    @FXML private TableView<?> selectedTable;
    @FXML private TextField allergensFilter;

    @FXML
    void setFilters(ActionEvent event) {
        boolean veg = veganFlag.isSelected();
        boolean vgt = veggieFlag.isSelected();
        boolean cel = celiacFlag.isSelected();
    }
}
