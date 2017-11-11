package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public interface ComSalePromotionBlService {
    /**
     * submit a ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ComSalePromotionVo promotion);

    /**
     * save a half-completed ComSalePromotionVo as a draft
     * @param promotion the ComSalePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    ResultMessage saveAsDraft(ComSalePromotionVo promotion);

    /**
     * delete a overdue or needless ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(ComSalePromotionVo promotion);

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    String getId();
}
