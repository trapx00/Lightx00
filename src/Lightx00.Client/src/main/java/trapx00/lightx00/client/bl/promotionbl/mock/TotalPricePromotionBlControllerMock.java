package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.TotalPricePromotionBlController;
import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class TotalPricePromotionBlControllerMock extends TotalPricePromotionBlController {
    /**
     * submit a TotalPricePromotionVo
     * @param promotion the TotalPricePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPricePromotionVo promotion) {
        return super.submit(promotion);
    }

    /**
     * save a half-completed TotalPricePromotionVo as a draft
     * @param promotion the TotalPricePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(TotalPricePromotionVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless TotalPricePromotionVo
     * @param promotion the TotalPricePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPricePromotionVo promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some TotalPriceCouponVos
     * @param query the filter conditions
     * @return array of TotalPriceCouponVos which match the conditions
     */
    public TotalPricePromotionVo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next TotalPricePromotionVo
     * @return id for the next TotalPricePromotionVo
     */
    public String getId() {
        return super.getId();
    }
}
