package trapx00.lightx00.shared.po.manager.promotion;

public class TotalPriceGiftPo extends PromotionPoBase {
    PromotionCommodity[] gifts;
    double totalPrice;

    public TotalPriceGiftPo(String Id, String startDate, String endDate, PromotionState state, PromotionCommodity[] gifts, double totalPrice) {
        super(Id, PromotionType.TotalPriceGift, startDate, endDate, state);
        this.gifts = gifts;
        this.totalPrice = totalPrice;
    }
}
