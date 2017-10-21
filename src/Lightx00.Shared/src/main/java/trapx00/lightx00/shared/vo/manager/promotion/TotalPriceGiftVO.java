package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class TotalPriceGiftVo extends PromotionVoBase {
    PromotionCommodity[] gifts;
    double totalPrice;

    public TotalPriceGiftVo(String Id, String startDate, String endDate, PromotionState state, PromotionCommodity[] gifts, double totalPrice) {
        super(Id, PromotionType.TotalPriceGift, startDate, endDate, state);
        this.gifts = gifts;
        this.totalPrice = totalPrice;
    }
}
