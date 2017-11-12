package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.ClientPromotionBlController;

public class ClientPromotionBlServiceFactory {
    ClientPromotionBlService clientPromotionBlService = new ClientPromotionBlController();

    public ClientPromotionBlService getInstance() {
        return clientPromotionBlService;
    }
}
