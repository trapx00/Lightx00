package trapx00.lightx00.client.presentation.clientui;

import javafx.fxml.FXML;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;

import java.awt.event.ActionEvent;

public class ClientDetailUiController {

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/clientui/ClientDetailUi.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void onBtnBackClicked(){

    }
}
