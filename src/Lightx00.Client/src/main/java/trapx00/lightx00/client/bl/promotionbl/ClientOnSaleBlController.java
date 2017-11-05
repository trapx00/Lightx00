package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.*;

public class ClientOnSaleBlController {

    /**
     * submit a ClientOnSaleVo
     * @param newPromotion the ClientOnSaleVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientOnSaleVo newPromotion) {
        return null;
    }

    /**
     * save a half-completed ClientOnSaleVo as a draft
     * @param promotion the ClientOnSaleVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientOnSaleVo promotion) {
        return null;
    }

    /**
     * delete a overdue or needless ClientOnSaleVo
     * @param promotion the ClientOnSaleVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientOnSaleVo promotion) {
        return null;
    }

    /**
     * filter some ClientOnSaleVos
     * @param query the filter conditions
     * @return array of ClientOnSaleVos which match the conditions
     */
    public ClientOnSaleVo[] queryPromotion(PromotionQueryVo query) {
        return new ClientOnSaleVo[0];
    }

    /**
     * get id for the next ClientOnSaleVo
     * @return id for the next ClientOnSaleVo
     */
    public String getId() {
        return null;
    }

}
