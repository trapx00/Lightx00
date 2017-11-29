package trapx00.lightx00.client.presentation.promotionui.factory;

import trapx00.lightx00.client.presentation.promotionui.TotalPricePromotionUiControllerDraftController;
import trapx00.lightx00.client.presentation.promotionui.mock.TotalPricePromotionUiControllerMockDraftController;

public class TotalPricePromotionUiFactory {
    private static TotalPricePromotionUiControllerDraftController controller = new TotalPricePromotionUiControllerMockDraftController();

    public static TotalPricePromotionUiControllerDraftController getController() {
        return controller;
    }
}
