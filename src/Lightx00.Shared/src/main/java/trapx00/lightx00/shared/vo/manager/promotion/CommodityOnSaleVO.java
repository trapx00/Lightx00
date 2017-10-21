package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class CommodityOnSaleVo extends PromotionVoBase {
    private PromotionCommodity[] commodityOnSale;
    private double onSalePrice;

    public CommodityOnSaleVo(String id,  String startDate, String endDate, PromotionState state, PromotionCommodity[] commodityOnSale, double onSalePrice) {
        super(id, PromotionType.CommodityOnSale, startDate, endDate, state);
        this.commodityOnSale = commodityOnSale;
        this.onSalePrice = onSalePrice;
    }

    public double getOnSalePrice() {
        return onSalePrice;
    }

    public void setOnSalePrice(double onSalePrice) {
        this.onSalePrice = onSalePrice;
    }

    public PromotionCommodity[] getCommodityOnSale() {
        return commodityOnSale;
    }

    public void setCommodityOnSale(PromotionCommodity[] commodityOnSale) {
        this.commodityOnSale = commodityOnSale;
    }
}
