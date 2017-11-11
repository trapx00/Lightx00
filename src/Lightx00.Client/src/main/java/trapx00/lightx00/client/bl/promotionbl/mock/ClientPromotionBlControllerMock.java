package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ClientPromotionBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ClientPromotionBlControllerMock extends ClientPromotionBlController {

    /**
     * submit a ClientPromotionVo
     * @param promotion the ClientPromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientPromotionVo promotion) {
        return super.submit(promotion);
    }

    /**
     * save a half-completed ClientPromotionVo as a draft
     * @param promotion the ClientPromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientPromotionVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless ClientPromotionVo
     * @param promotion the ClientPromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientPromotionVo promotion) {
        return super.delete(promotion);
    }

    /**
     * get id for the next ClientPromotionVo
     * @return id for the next ClientPromotionVo
     */
    public String getId() {
        return super.getId();
    }
}
