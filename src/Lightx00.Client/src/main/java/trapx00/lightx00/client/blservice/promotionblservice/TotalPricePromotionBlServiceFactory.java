package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.factory.TotalPricePromotionFactory;

public class TotalPricePromotionBlServiceFactory {

    public static TotalPricePromotionBlService getInstance() {
        return TotalPricePromotionFactory.getController();
    }
}
