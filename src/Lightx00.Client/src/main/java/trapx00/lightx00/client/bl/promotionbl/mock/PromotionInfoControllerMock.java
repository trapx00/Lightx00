package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.PromotionInfoController;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;

public class PromotionInfoControllerMock extends PromotionInfoController {
    /**
     * give promotion information to the saleman
     * @param saleBill SallBillVo which asks for useable promotion in this sale beheavior
     * @return array of promotions that can be used in this sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return super.queryPromotion(saleBill);
    }

}
