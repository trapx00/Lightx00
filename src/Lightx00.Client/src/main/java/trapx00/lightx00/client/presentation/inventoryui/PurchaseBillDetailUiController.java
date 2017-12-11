package trapx00.lightx00.client.presentation.inventoryui;

import trapx00.lightx00.client.presentation.helpui.BillDetailUi;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.BillVo;

public class PurchaseBillDetailUiController extends BillDetailUi {
    @Override
    public ExternalLoadedUiPackage showContent(BillVo arg) {
        return null;
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/PurchaseBillDetailUi.fxml").loadAndGetPackageWithoutException();
    }
}
