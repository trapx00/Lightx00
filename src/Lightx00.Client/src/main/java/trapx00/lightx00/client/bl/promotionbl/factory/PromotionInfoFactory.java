package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;
import trapx00.lightx00.client.bl.promotionbl.mock.PromotionInfoControllerMock;

public class PromotionInfoFactory {
    private static PromotionInfoController controller = new PromotionInfoControllerMock();
    private static PromotionInfo promotionInfo = controller;

    public static PromotionInfoController getController() {
        return controller;
    }
    public static PromotionInfo getPromotionInfo() {
        return promotionInfo;
    }
}
