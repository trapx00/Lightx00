package trapx00.lightx00.client.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class ClientPromotionVo extends PromotionVoBase {
    private int clientLevel;
    private double couponPrice;

    public ClientPromotionVo(String id, Date startDate, Date endDate, PromotionState state,
                             int clientLevel, double couponPrice) {
        super(id, PromotionType.ClientPromotion, startDate, endDate, PromotionState.Waiting);
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
