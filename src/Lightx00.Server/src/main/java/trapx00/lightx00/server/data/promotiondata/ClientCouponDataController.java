package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.PromotionManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

public class ClientCouponDataController implements PromotionManagementDataService {

    /**
     * submit a completed promotion
     * @param promotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(PromotionPoBase promotion){
        return null;
    }

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    public PromotionPoBase[] queryPromotion(PromotionQueryVo query) {
        return new PromotionPoBase[0];
    }

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(PromotionPoBase promotion) {
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
