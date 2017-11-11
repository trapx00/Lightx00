package trapx00.lightx00.client.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class ComSalePromotionVo extends PromotionVoBase {
    private PromotionCommodity[] commodityOnSale;
    private double onSalePrice;

    public ComSalePromotionVo(String id, Date startDate, Date endDate, PromotionState state,
                              PromotionCommodity[] commodityOnSale, double onSalePrice) {
        super(id, PromotionType.ComSalePromotion, startDate, endDate, PromotionState.Waiting);
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
