package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.promotionbl.ComSalePromotionBlController;
import trapx00.lightx00.client.bl.promotionbl.mock.ComSalePromotionBlControllerMock;

public class ComSalePromotionFactory {
    private static ComSalePromotionBlController controller = new ComSalePromotionBlControllerMock();
    private static DraftDeleteService draftDeleteService = controller;

    public static ComSalePromotionBlController getController() {
        return controller;
    }

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }

}
