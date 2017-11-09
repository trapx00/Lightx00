package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public interface ClientPromotionDataService {
    /**
     * submit a completed ClientPromotionPo
     * @param promotion the ClientPromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ClientPromotionPo promotion);

    /**
     * filter ClientPromotionPo
     * @param query the filter conditions
     * @return array of ClientPromotionPo which match the conditions
     */
    ClientPromotionPo[] queryPromotion(PromotionQueryVo query) ;

    /**
     * delete a useless ClientPromotionPo
     * @param promotion the ClientPromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(ClientPromotionPo promotion);

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    String getId();
}
