package trapx00.lightx00.shared.po.manager.promotion;

public class ClientCouponPo extends PromotionPoBase {
    int clientLevel;
    double couponPrice;

    public ClientCouponPo(String Id,  String startDate, String endDate, PromotionState state, int clientLevel, double couponPrice) {
        super(Id, PromotionType.ClientCoupon, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.couponPrice = couponPrice;
    }
}
