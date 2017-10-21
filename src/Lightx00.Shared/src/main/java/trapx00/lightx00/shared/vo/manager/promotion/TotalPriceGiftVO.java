package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class TotalPriceGiftVo extends PromotionVoBase {
    private PromotionCommodity[] gifts;
    private double totalPrice;

    public TotalPriceGiftVo(String id, String startDate, String endDate, PromotionState state, PromotionCommodity[] gifts, double totalPrice) {
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
