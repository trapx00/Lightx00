package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class ComSalePromotionPo extends PromotionPoBase {
    private PromotionCommodity[] commodityOnSale;
    private double onSalePrice;

    public ComSalePromotionPo(String id, Date startDate, Date endDate, PromotionState state,
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
