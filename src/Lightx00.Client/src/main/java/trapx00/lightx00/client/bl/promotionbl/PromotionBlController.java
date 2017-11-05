package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.blservice.promotionblservice.PromotionManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public class PromotionBlController implements PromotionInfo,PromotionManagementBlService,DraftDeleteService {

    /**
     * give promotion information to the saleman
     * @param saleBill SallBillVo which asks for useable promotion in this sale beheavior
     * @return array of promotions that can be used in this sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[0];
    }

    /**
     * submit a promotion
     * @param newPromotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PromotionVoBase newPromotion) {
        return null;
    }

    /**
     * save a half-completed promotion as a draft
     * @param promotion the promotion to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PromotionVoBase promotion) {
        return null;
    }

    /**
     * delete a overdue or needless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(PromotionVoBase promotion) {
        return null;
    }

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    @Override
    public PromotionVoBase[] queryPromotion(PromotionQueryVo query) {
        return new PromotionVoBase[0];
    }

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * delete a draft
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }
}
