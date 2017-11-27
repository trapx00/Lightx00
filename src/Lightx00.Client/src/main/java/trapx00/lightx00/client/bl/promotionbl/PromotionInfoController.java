package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;

public class PromotionInfoController implements PromotionInfo {
    /**
     * Give usable promotions to the sale.
     * @param saleBill the saleBill which represents current sale activity
     * @return usable promotions to the sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[0];
    }

}
