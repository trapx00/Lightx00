package trapx00.lightx00.shared.po.manager.promotion;

public class TotalPriceCouponPo extends PromotionPoBase {
    double couponPrice;
    double totalPrice;

    public TotalPriceCouponPo(String Id, String startDate, String endDate, PromotionState state, double couponPrice, double totalPrice) {
        super(Id, PromotionType.TotalPriceCoupon, startDate, endDate, state);
        this.couponPrice = couponPrice;
        this.totalPrice = totalPrice;
    }
}
