package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class CommodityOnSaleVo extends PromotionVoBase {
    PromotionCommodity[] commodityOnSale;
    double onSalePrice;

    public CommodityOnSaleVo(String Id,  String startDate, String endDate, PromotionState state, PromotionCommodity[] commodityOnSale, double onSalePrice) {
        super(Id, PromotionType.CommodityOnSale, startDate, endDate, state);
        this.commodityOnSale = commodityOnSale;
        this.onSalePrice = onSalePrice;
    }
}
