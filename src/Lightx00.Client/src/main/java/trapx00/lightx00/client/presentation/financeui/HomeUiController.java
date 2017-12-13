package trapx00.lightx00.client.presentation.financeui;

import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;

public class HomeUiController implements ExternalLoadableUiController {
    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/Home.fxml").loadAndGetPackageWithoutException();
    }
}
