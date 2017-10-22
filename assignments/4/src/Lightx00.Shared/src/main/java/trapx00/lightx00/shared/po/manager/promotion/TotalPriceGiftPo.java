package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class TotalPriceGiftPo extends PromotionPoBase {
    private PromotionCommodity[] gifts;
    private double totalPrice;

    public TotalPriceGiftPo(String id, Date startDate, Date endDate, PromotionState state, PromotionCommodity[] gifts, double totalPrice) {
        super(id, PromotionType.TotalPriceGift, startDate, endDate, state);
        this.gifts = gifts;
        this.totalPrice = totalPrice;
    }

    public PromotionCommodity[] getGifts() {
        return gifts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
