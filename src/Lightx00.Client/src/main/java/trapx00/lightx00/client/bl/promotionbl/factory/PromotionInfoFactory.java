package trapx00.lightx00.client.bl.promotionbl.factory;

import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;

public class PromotionInfoFactory {
    private static PromotionInfo service = new PromotionInfoController();;

    public static PromotionInfo getService(){
        return service;
    }
}
