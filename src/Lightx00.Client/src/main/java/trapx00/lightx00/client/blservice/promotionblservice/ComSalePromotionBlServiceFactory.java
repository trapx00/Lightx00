package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.ComSalePromotionBlController;

public class ComSalePromotionBlServiceFactory {
    ComSalePromotionBlService comSalePromotionBlService = new ComSalePromotionBlController();

    public ComSalePromotionBlService getInstance() {
        return comSalePromotionBlService;
    }
}
