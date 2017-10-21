package trapx00.lightx00.shared.po.manager.promotion;

public class CommodityOnSalePo extends PromotionPoBase {
    PromotionCommodity[] commodityOnSale;
    double onSalePrice;

    public CommodityOnSalePo(String Id,  String startDate, String endDate, PromotionState state, PromotionCommodity[] commodityOnSale, double onSalePrice) {
        super(Id, PromotionType.CommodityOnSale, startDate, endDate, state);
        this.commodityOnSale = commodityOnSale;
        this.onSalePrice = onSalePrice;
    }
}
