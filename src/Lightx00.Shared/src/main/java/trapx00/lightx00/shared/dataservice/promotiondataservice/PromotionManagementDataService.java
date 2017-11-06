package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;
import trapx00.lightx00.shared.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

import java.util.Date;

public interface PromotionManagementDataService {
    /**
     * submit a completed promotion
     * @param promotion the promotion to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PromotionPoBase promotion);

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    PromotionPoBase[] queryPromotion(PromotionQueryVo query) ;

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(PromotionPoBase promotion);

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    String getId();
}
