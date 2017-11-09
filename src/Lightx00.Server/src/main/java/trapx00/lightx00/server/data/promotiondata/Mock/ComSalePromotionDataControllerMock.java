package trapx00.lightx00.server.data.promotiondata.Mock;

import trapx00.lightx00.server.data.promotiondata.ComSalePromotionDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ComSalePromotionDataControllerMock extends ComSalePromotionDataController {

    /**
     * submit a completed ComSalePromotionPo
     * @param promotion the ComSalePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ComSalePromotionPo promotion){
        return super.submit(promotion);
    }

    /**
     * filter ComSalePromotionPo
     * @param query the filter conditions
     * @return array of ComSalePromotionPo which match the conditions
     */
    public ComSalePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ComSalePromotionPo promotion) {
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
