package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.PromotionBlController;

public class PromotinoManagementBlServiceFactory {
    public static PromotionManagementBlService getInstance(){
        return new PromotionBlController();
    }
}
