package trapx00.lightx00.client.presentation.commodityui.factory;

import trapx00.lightx00.client.presentation.commodityui.CommoditySelectingDialog;
import trapx00.lightx00.client.presentation.commodityui.CommoditySelection;
import trapx00.lightx00.client.presentation.commodityui.CommodityUiController;
import trapx00.lightx00.client.presentation.commodityui.mock.CommodityUiControllerMock;

public class CommodityUiFactory {
    private static CommodityUiController commodityUiController = new CommodityUiControllerMock();

    public static CommoditySelection getCommoditySelectionUi(){
        return new CommoditySelectingDialog();
    }
}
