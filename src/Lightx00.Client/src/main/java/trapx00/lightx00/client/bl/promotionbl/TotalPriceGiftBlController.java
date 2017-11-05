package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.TotalPriceGiftVo;

public class TotalPriceGiftBlController {
    /**
     * submit a TotalPriceGiftVo
     * @param newPromotion the TotalPriceGiftVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPriceGiftVo newPromotion) {
        return null;
    }

    /**
     * save a half-completed TotalPriceGiftVo as a draft
     * @param promotion the TotalPriceGiftVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(TotalPriceGiftVo promotion) {
        return null;
    }

    /**
     * delete a overdue or needless TotalPriceGiftVo
     * @param promotion the TotalPriceGiftVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPriceGiftVo promotion) {
        return null;
    }

    /**
     * filter some TotalPriceGiftVos
     * @param query the filter conditions
     * @return array of TotalPriceGiftVos which match the conditions
     */
    public TotalPriceGiftVo[] queryPromotion(PromotionQueryVo query) {
        return new TotalPriceGiftVo[0];
    }

    /**
     * get id for the next TotalPriceGiftVo
     * @return id for the next TotalPriceGiftVo
     */
    public String getId() {
        return null;
    }
}
