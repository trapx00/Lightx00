package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class ClientCouponVo extends PromotionVoBase {
    int clientLevel;
    double couponPrice;

    public ClientCouponVo(String Id, String startDate, String endDate, PromotionState state, int clientLevel, double couponPrice) {
        super(Id, PromotionType.ClientCoupon, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.couponPrice = couponPrice;
    }
}
