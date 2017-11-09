package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ClientOnSaleBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ClientOnSaleVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionQueryVo;

public class ClientOnSaleBlControllerMock extends ClientOnSaleBlController{
    /**
     * submit a ClientOnSaleVo
     * @param newPromotion the ClientOnSaleVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientOnSaleVo newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed ClientOnSaleVo as a draft
     * @param promotion the ClientOnSaleVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientOnSaleVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless ClientOnSaleVo
     * @param promotion the ClientOnSaleVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientOnSaleVo promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some ClientOnSaleVos
     * @param query the filter conditions
     * @return array of ClientOnSaleVos which match the conditions
     */
    public ClientOnSaleVo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next ClientOnSaleVo
     * @return id for the next ClientOnSaleVo
     */
    public String getId() {
        return super.getId();
    }


}
