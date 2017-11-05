package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.TotalPriceGiftBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.TotalPriceGiftVo;

public class TotalPriceGiftBlControllerMock extends TotalPriceGiftBlController {
    /**
     * submit a TotalPriceGiftVo
     * @param newPromotion the TotalPriceGiftVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPriceGiftVo newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed TotalPriceGiftVo as a draft
     * @param promotion the TotalPriceGiftVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(TotalPriceGiftVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless TotalPriceGiftVo
     * @param promotion the TotalPriceGiftVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPriceGiftVo promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some TotalPriceGiftVos
     * @param query the filter conditions
     * @return array of TotalPriceGiftVos which match the conditions
     */
    public TotalPriceGiftVo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next TotalPriceGiftVo
     * @return id for the next TotalPriceGiftVo
     */
    public String getId() {
        return super.getId();
    }
}
