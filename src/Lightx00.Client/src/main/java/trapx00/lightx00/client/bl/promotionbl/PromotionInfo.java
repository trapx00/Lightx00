package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public interface PromotionInfo {
    /**
     * query for PromotionVo which current sale can use
     * @param saleBill
     * @return array of PromotionVo which current sale can use
     */
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill);

}
