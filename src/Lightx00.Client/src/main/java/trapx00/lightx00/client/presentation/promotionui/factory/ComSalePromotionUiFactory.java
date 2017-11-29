package trapx00.lightx00.client.presentation.promotionui.factory;

import trapx00.lightx00.client.presentation.promotionui.ComSalePromotionUiControllerDraftController;
import trapx00.lightx00.client.presentation.promotionui.mock.ComSalePromotionUiControllerMockDraftController;

public class ComSalePromotionUiFactory {
    private static ComSalePromotionUiControllerDraftController controller = new ComSalePromotionUiControllerMockDraftController();

    public static ComSalePromotionUiControllerDraftController getController() {
        return controller;
    }
}
