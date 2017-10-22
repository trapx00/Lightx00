package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class ClientCouponVo extends PromotionVoBase {
    private int clientLevel;
    private double couponPrice;

    public ClientCouponVo(String id, Date startDate, Date endDate, PromotionState state,
                          int clientLevel, double couponPrice) {
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
