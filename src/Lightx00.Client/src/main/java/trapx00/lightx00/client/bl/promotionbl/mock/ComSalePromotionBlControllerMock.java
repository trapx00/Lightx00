package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ComSalePromotionBlController;
import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ComSalePromotionBlControllerMock extends ComSalePromotionBlController {
    /**
     * submit a ComSalePromotionVo
     * @param newPromotion the ComSalePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ComSalePromotionVo newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed ComSalePromotionVo as a draft
     * @param promotion the ComSalePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ComSalePromotionVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ComSalePromotionVo promotion) {
        return super.delete(promotion);
    }

    /**
     * get id for the next ComSalePromotionVo
     * @return id for the next ComSalePromotionVo
     */
    public String getId() {
        return super.getId();
    }

}
