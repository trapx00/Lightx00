package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

public class ClientGiftVo extends PromotionVoBase {
    int clientLevel;
    PromotionCommodity[] gifts;

    public ClientGiftVo(String Id,  String startDate, String endDate, PromotionState state, int clientLevel, PromotionCommodity[] gifts) {
        super(Id, PromotionType.ClientGift, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.gifts = gifts;
    }
}
