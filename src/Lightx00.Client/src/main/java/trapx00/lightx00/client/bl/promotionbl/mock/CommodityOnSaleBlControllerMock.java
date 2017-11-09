package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.CommodityOnSaleBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.CommodityOnSaleVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionQueryVo;

public class CommodityOnSaleBlControllerMock extends CommodityOnSaleBlController {
    /**
     * submit a CommodityOnSaleVo
     * @param newPromotion the CommodityOnSaleVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(CommodityOnSaleVo newPromotion) {
        return super.submit(newPromotion);
    }

    /**
     * save a half-completed CommodityOnSaleVo as a draft
     * @param promotion the CommodityOnSaleVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(CommodityOnSaleVo promotion) {
        return super.saveAsDraft(promotion);
    }

    /**
     * delete a overdue or needless CommodityOnSaleVo
     * @param promotion the CommodityOnSaleVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(CommodityOnSaleVo promotion) {
        return super.delete(promotion);
    }

    /**
     * filter some CommodityOnSaleVos
     * @param query the filter conditions
     * @return array of CommodityOnSaleVos which match the conditions
     */
    public CommodityOnSaleVo[] queryPromotion(PromotionQueryVo query) {
        return super.queryPromotion(query);
    }

    /**
     * get id for the next CommodityOnSaleVo
     * @return id for the next CommodityOnSaleVo
     */
    public String getId() {
        return super.getId();
    }

}
