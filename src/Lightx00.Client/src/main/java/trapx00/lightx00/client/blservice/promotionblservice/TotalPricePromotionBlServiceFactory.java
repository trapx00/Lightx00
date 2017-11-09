package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.bl.promotionbl.TotalPricePromotionBlController;

public class TotalPricePromotionBlServiceFactory {
    TotalPricePromotionBlService totalPricePromotionBlService = new TotalPricePromotionBlController();

    public TotalPricePromotionBlService getInstance() {
        return totalPricePromotionBlService;
    }
}
