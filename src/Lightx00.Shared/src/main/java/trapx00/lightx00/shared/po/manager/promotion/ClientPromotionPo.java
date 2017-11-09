package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class ClientPromotionPo extends PromotionPoBase {
    private int clientLevel;
    private double couponPrice;

    public ClientPromotionPo(String id, Date startDate, Date endDate, PromotionState state, int clientLevel, double couponPrice) {
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
