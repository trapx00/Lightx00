package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.blservice.promotionblservice.ClientPromotionBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ClientPromotionVo;
import trapx00.lightx00.shared.queryvo.promotion.ClientPromotionQueryVo;

public class ClientPromotionBlController implements ClientPromotionBlService, DraftDeleteService {
    /**
     * Submit a ClientPromotionVo.
     * @param promotion the ClientPromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ClientPromotionVo promotion) {
        return null;
    }

    /**
     * Save a half-completed ClientPromotionVo as a draft.
     * @param promotion the ClientPromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(ClientPromotionVo promotion) {
        return null;
    }

    /**
     * Filter ClientPromotionVo.
     * @param query the filter conditions
     * @return array of ClientPromotionVo which match the conditions
     */
    @Override
    public ClientPromotionVo[] queryPromotion(ClientPromotionQueryVo query) {
        return new ClientPromotionVo[0];
    }

    /**
     * Delete a overdue or needless ClientPromotionVo.
     * @param promotion the ClientPromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(ClientPromotionVo promotion) {
        return null;
    }

    /**
     * Get id for the next ClientPromotionVo.
     * @return id for the next ClientPromotionVo
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Delete a draft.
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }
}
