package trapx00.lightx00.client.presentation.commodityui.factory;

import trapx00.lightx00.client.presentation.commodityui.CommoditySortUiController;
import trapx00.lightx00.client.presentation.commodityui.CommodityUiController;
import trapx00.lightx00.client.presentation.commodityui.mock.CommoditySortUiControllerMock;
import trapx00.lightx00.client.presentation.commodityui.mock.CommodityUiControllerMock;

public class CommoditySortUiFactory {
    private static CommoditySortUiController commodityUiController = new CommoditySortUiControllerMock();
    static {
        // 以后要改，controller应该是用fxmlloader拿
    }
}
