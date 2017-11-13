package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.promotionbl.TotalPricePromotionBlController;
import trapx00.lightx00.client.bl.promotionbl.mock.TotalPricePromotionBlControllerMock;

public class TotalPricePromotionFactory {
    private static TotalPricePromotionBlController controller = new TotalPricePromotionBlControllerMock();
    private static DraftDeleteService draftDeleteService = controller;

    public static TotalPricePromotionBlController getController() {
        return controller;
    }

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }

}
