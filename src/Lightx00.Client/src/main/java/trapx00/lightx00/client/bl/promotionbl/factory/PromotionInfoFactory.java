package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;

public class PromotionInfoFactory {
    private static PromotionInfoController controller = new PromotionInfoController();
    private static PromotionInfo promotionInfo = controller;

    public static PromotionInfo getPromotionInfo(){
        return promotionInfo;
    }
}
