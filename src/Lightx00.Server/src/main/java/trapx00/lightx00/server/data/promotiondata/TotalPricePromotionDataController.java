package trapx00.lightx00.server.data.promotiondata;

import trapx00.lightx00.shared.dataservice.promotiondataservice.TotalPricePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class TotalPricePromotionDataController implements TotalPricePromotionDataService {

    /**
     * submit a completed TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(TotalPricePromotionPo promotion){
        return null;
    }

    /**
     * filter TotalPricePromotionPo
     * @param query the filter conditions
     * @return array of TotalPricePromotionPo which match the conditions
     */
    public TotalPricePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new TotalPricePromotionPo[0];
    }

    /**
     * delete a useless TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(TotalPricePromotionPo promotion) {
        return null;
    }

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    public String getId(){
        return null;
    }
}
