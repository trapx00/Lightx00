package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.factory.ComSalePromotionFactory;

public class ComSalePromotionBlServiceFactory {

    public static ComSalePromotionBlService getInstance() {
        return ComSalePromotionFactory.getController();
    }
}
