package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public interface ClientPromotionBlService {
    /**
     * submit a ClientPromotionVo
     * @param promotion the ClientPromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ClientPromotionVo promotion);

    /**
     * save a half-completed ClientPromotionVo as a draft
     * @param promotion the ClientPromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    ResultMessage saveAsDraft(ClientPromotionVo promotion);

    /**
     * delete a overdue or needless ClientPromotionVo
     * @param promotion the ClientPromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(ClientPromotionVo promotion);

    /**
     * filter ClientPromotionVo
     * @param query the filter conditions
     * @return array of ClientPromotionVo which match the conditions
     */
    ClientPromotionVo[] queryPromotion(PromotionQueryVo query);

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    String getId();
}
