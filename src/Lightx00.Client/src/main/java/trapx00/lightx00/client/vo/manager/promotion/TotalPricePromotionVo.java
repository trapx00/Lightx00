package trapx00.lightx00.client.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class TotalPricePromotionVo extends PromotionVoBase {
    private double couponPrice;
    private double totalPrice;

    public TotalPricePromotionVo(String id, Date startDate, Date endDate,
                                 PromotionState state, double couponPrice, double totalPrice) {
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
