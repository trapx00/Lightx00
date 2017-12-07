package trapx00.lightx00.client.presentation.commodityui;

import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;

public class CommodityUiController implements ExternalLoadableUiController {
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/CommodityUi.fxml").loadAndGetPackageWithoutException();
    }
}
