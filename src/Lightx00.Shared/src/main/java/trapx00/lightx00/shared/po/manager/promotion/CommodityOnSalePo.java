package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class CommodityOnSalePo extends PromotionPoBase {
    private PromotionCommodity[] commodityOnSale;
    private double onSalePrice;

    public CommodityOnSalePo(String id, Date startDate, Date endDate, PromotionState state,
                             PromotionCommodity[] commodityOnSale, double onSalePrice) {
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
