package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.factory.ClientPromotionFactory;

public class ClientPromotionBlServiceFactory {

    public static ClientPromotionBlService getInstance() {
        return ClientPromotionFactory.getController();
    }
}
