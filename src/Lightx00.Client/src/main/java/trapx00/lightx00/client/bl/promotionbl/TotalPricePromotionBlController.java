package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.blservice.promotionblservice.TotalPricePromotionBlService;
import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.promotion.TotalPricePromotionQueryVo;

public class TotalPricePromotionBlController implements TotalPricePromotionBlService, DraftDeleteService {
    /**
     * Submit a TotalPriceGiftVo.
     * @param promotion the TotalPriceGiftVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(TotalPricePromotionVo promotion) {
        return null;
    }

    /**
     * Save a half-completed TotalPriceGiftVo as a draft.
     * @param promotion the TotalPriceGiftVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(TotalPricePromotionVo promotion) {
        return null;
    }

    /**
     * Filter TotalPricePromotionVo.
     * @param query the filter conditions
     * @return array of TotalPricePromotionVo which match the conditions
     */
    @Override
    public TotalPricePromotionVo[] queryPromotion(TotalPricePromotionQueryVo query) {
        return new TotalPricePromotionVo[0];
    }

    /**
     * Delete a overdue or needless TotalPriceGiftVo.
     * @param promotion the TotalPriceGiftVo to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(TotalPricePromotionVo promotion) {
        return null;
    }

    /**
     * Get id for the next TotalPriceGiftVo.
     * @return id for the next TotalPriceGiftVo
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Delete a draft.
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }
}
