package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;

public class PromotionInfoController implements PromotionInfo {

    /**
     * give useable promotions to the sale
     * @param saleBill the salebill which represents current sale behaviour
     * @return useable promotions to the sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[0];
    }

}
