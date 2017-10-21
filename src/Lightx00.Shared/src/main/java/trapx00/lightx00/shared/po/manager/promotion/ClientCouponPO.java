package trapx00.lightx00.shared.po.manager.promotion;

public class ClientCouponPo extends PromotionPoBase {
    private int clientLevel;
    private double couponPrice;

    public ClientCouponPo(String id,  String startDate, String endDate, PromotionState state, int clientLevel, double couponPrice) {
        super(id, PromotionType.ClientCoupon, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.couponPrice = couponPrice;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(int clientLevel) {
        this.clientLevel = clientLevel;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }
}
