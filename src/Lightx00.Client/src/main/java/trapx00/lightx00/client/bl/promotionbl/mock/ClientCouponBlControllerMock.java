package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ClientCouponBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ClientCouponVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionQueryVo;

public class ClientCouponBlControllerMock extends ClientCouponBlController {

    /**
     * submit a ClientCouponVo
     * @param newPromotion the ClientCouponVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientCouponVo newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed ClientCouponVo as a draft
     * @param promotion the ClientCouponVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientCouponVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless ClientCouponVo
     * @param promotion the ClientCouponVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientCouponVo promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some ClientCouponVos
     * @param query the filter conditions
     * @return array of ClientCouponVos which match the conditions
     */
    public ClientCouponVo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next ClientCouponVo
     * @return id for the next ClientCouponVo
     */
    public String getId() {
        return super.getId();
    }
}
