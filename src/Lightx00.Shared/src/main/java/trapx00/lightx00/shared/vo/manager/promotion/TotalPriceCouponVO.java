package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class TotalPriceCouponVo extends PromotionVoBase {
    double couponPrice;
    double totalPrice;

    public TotalPriceCouponVo(String Id, String startDate, String endDate, PromotionState state, double couponPrice, double totalPrice) {
        super(Id, PromotionType.TotalPriceCoupon, startDate, endDate, state);
        this.couponPrice = couponPrice;
        this.totalPrice = totalPrice;
    }
}
