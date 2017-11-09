package trapx00.lightx00.server.data.promotiondata.Mock;

import trapx00.lightx00.server.data.promotiondata.ClientPromotionDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ClientPromotionDataControllerMock extends ClientPromotionDataController {

    /**
     * submit a completed ClientPromotionPo
     * @param promotion the ClientPromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientPromotionPo promotion){
        return super.submit(promotion);
    }

    /**
     * filter ClientPromotionPo
     * @param query the filter conditions
     * @return array of ClientPromotionPo which match the conditions
     */
    public ClientPromotionPo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * delete a useless ClientPromotionPo
     * @param promotion the ClientPromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientPromotionPo promotion) {
        return super.delete(promotion);
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    public String getId(){
        return super.getId();
    }
}
