package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.ClientGiftVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

public class ClientGiftBlController {

    /**
     * submit a ClientGiftVo
     * @param newPromotion the ClientGiftVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientGiftVo newPromotion) {
        return null;
    }

    /**
     * save a half-completed ClientGiftVo as a draft
     * @param promotion the ClientGiftVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientGiftVo promotion) {
        return null;
    }

    /**
     * delete a overdue or needless ClientGiftVo
     * @param promotion the ClientGiftVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientGiftVo promotion) {
        return null;
    }

    /**
     * filter some ClientGiftVos
     * @param query the filter conditions
     * @return array of ClientGiftVos which match the conditions
     */
    public ClientGiftVo[] queryPromotion(PromotionQueryVo query) {
        return new ClientGiftVo[0];
    }

    /**
     * get id for the next ClientGiftVo
     * @return id for the next ClientGiftVo
     */
    public String getId() {
        return null;
    }
}
