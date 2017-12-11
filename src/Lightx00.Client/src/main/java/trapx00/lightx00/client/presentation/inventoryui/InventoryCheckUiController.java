package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.fxml.FXML;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;

public class InventoryCheckUiController implements ExternalLoadableUiController {
    @FXML
    private JFXDatePicker startDatePicker;
    @FXML private JFXDatePicker endDatePicker;
    @FXML private JFXButton btnFilter;


    @Override
    public ExternalLoadedUiPackage load() {
        return null;
    }
}
