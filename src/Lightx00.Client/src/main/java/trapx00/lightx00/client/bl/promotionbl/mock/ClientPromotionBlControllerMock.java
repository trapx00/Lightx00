package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ClientPromotionBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

public class ClientPromotionBlControllerMock extends ClientPromotionBlController {

    /**
     * submit a ClientPromotionVo
     * @param promotion the ClientPromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ClientPromotionVo promotion) {
        return ResultMessage.Success;
    }

    /**
     * save a half-completed ClientPromotionVo as a draft
     * @param promotion the ClientPromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ClientPromotionVo promotion) {
        return ResultMessage.Success;
    }

    /**
     * filter ClientPromotionVo
     * @param query the filter conditions
     * @return array of ClientPromotionVo which match the conditions
     */
    @Override
    public ClientPromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new ClientPromotionVo[]{
                new ClientPromotionVo("0001",new Date(),new Date(), PromotionState.Waiting,1,200,null,0)
        };
    }


    /**
     * delete a overdue or needless ClientPromotionVo
     * @param promotion the ClientPromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ClientPromotionVo promotion) {
        return ResultMessage.Success;
    }

    /**
     * get id for the next ClientPromotionVo
     * @return id for the next ClientPromotionVo
     */
    public String getId() {
        return super.getId();
    }

    /**
     * delete a draft
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return ResultMessage.Success;
    }
}
