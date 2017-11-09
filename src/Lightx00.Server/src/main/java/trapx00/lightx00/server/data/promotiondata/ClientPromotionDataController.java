package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ClientPromotionDataController implements ClientPromotionDataService {

    /**
     * submit a completed ClientPromotionPo
     * @param promotion the ClientPromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientPromotionPo promotion){
        return null;
    }

    /**
     * filter ClientPromotionPo
     * @param query the filter conditions
     * @return array of ClientPromotionPo which match the conditions
     */
    public ClientPromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new ClientPromotionPo[0];
    }

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientPromotionPo promotion) {
        return null;
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    public String getId(){
        return null;
    }
}
