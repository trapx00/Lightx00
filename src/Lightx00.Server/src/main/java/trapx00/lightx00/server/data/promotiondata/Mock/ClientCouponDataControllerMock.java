package trapx00.lightx00.server.data.promotiondata.Mock;

import trapx00.lightx00.server.data.promotiondata.ClientCouponDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

public class ClientCouponDataControllerMock extends ClientCouponDataController {

    /**
     * submit a completed promotion
     * @param promotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(PromotionPoBase promotion){
        return super.submit(promotion);
    }

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    public PromotionPoBase[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(PromotionPoBase promotion) {
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
