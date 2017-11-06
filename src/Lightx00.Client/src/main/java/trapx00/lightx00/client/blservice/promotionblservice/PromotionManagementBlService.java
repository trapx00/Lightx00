package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionVoBase;

public interface PromotionManagementBlService {

    /**
     * submit a promotion
     * @param newPromotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PromotionVoBase newPromotion);

    /**
     * save a half-completed promotion as a draft
     * @param promotion the promotion to be saved as a draft
     * @return whether the operation is done successfully
     */
    ResultMessage saveAsDraft(PromotionVoBase promotion);

    /**
     * delete a overdue or needless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(PromotionVoBase promotion);

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    PromotionVoBase[] queryPromotion(PromotionQueryVo query);

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    String getId();
}
