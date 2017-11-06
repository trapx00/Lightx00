package trapx00.lightx00.server.data.financedata.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.PromotionManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.CommodityOnSalePo;
import trapx00.lightx00.shared.vo.manager.promotion.PromotionQueryVo;

public class CommodityOnSaleDataController implements PromotionManagementDataService {

    /**
     * submit a completed promotion
     * @param promotion the promotion to be submitted
     * @return whether the operation is done successfully
     */

    public ResultMessage submit(CommodityOnSalePo promotion) {
        return null;
    }

    /**
     * filter some promotions
     * @param query the filter conditions
     * @return array of promotions which match the conditions
     */
    @Override
    public CommodityOnSalePo[] queryPromotion(PromotionQueryVo query) {
        return new CommodityOnSalePo[0];
    }

    /**
     * delete a useless promotion
     * @param promotion the promotion to be deleted
     * @return whether the operation is done successfully
     */

    public ResultMessage delete(CommodityOnSalePo promotion) {
        return null;
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    @Override
   public String getId(){
        return null;
    }
}
