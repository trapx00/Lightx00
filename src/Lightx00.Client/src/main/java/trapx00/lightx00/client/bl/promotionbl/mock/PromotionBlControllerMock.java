package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.PromotionBlController;
import trapx00.lightx00.client.bl.promotionbl.PromotionInfo;
import trapx00.lightx00.client.blservice.promotionblservice.PromotionManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

public class PromotionBlControllerMock extends PromotionBlController {
    /**
     * give promotion information to the saleman
     * @param saleBill SallBillVo which asks for useable promotion in this sale beheavior
     * @return array of promotions that can be used in this sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return super.queryPromotion(saleBill);
    }

    /**
     * submit a promotion
     * @param newPromotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(PromotionVoBase newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed promotion as a draft
     * @param promotion the promotion to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(PromotionVoBase promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(PromotionVoBase promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    @Override
    public PromotionVoBase[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    @Override
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
        return super.deleteDraft(id);
    }

}
