package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class TotalPriceCouponPo extends PromotionPoBase {
    private double couponPrice;
    private double totalPrice;

    public TotalPriceCouponPo(String id, Date startDate, Date endDate, PromotionState state, double couponPrice, double totalPrice) {
        super(id, PromotionType.TotalPriceCoupon, startDate, endDate, state);
        this.couponPrice = couponPrice;
        this.totalPrice = totalPrice;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

