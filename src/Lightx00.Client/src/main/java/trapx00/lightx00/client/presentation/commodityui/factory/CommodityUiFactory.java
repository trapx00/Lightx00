package trapx00.lightx00.client.presentation.commodityui.factory;

import trapx00.lightx00.client.presentation.commodityui.CommodityUiController;
import trapx00.lightx00.client.presentation.commodityui.mock.CommodityUiControllerMock;

public class CommodityUiFactory {
    private static CommodityUiController commodityUiController = new CommodityUiControllerMock();
    static {
        // 以后要改，controller应该是用fxmlloader拿
    }
}
