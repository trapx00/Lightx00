package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.ClientCouponVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

public class ClientCouponBlController{

    /**
     * submit a ClientCouponVo
     * @param newPromotion the ClientCouponVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientCouponVo newPromotion) {
        return null;
    }

    /**
     * save a half-completed ClientCouponVo as a draft
     * @param promotion the ClientCouponVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientCouponVo promotion) {
        return null;
    }

    /**
     * delete a overdue or needless ClientCouponVo
     * @param promotion the ClientCouponVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientCouponVo promotion) {
        return null;
    }

    /**
     * filter some ClientCouponVos
     * @param query the filter conditions
     * @return array of ClientCouponVos which match the conditions
     */
    public ClientCouponVo[] queryPromotion(PromotionQueryVo query) {
        return new ClientCouponVo[0];
    }

    /**
     * get id for the next ClientCouponVo
     * @return id for the next ClientCouponVo
     */
    public String getId() {
        return null;
    }
}
