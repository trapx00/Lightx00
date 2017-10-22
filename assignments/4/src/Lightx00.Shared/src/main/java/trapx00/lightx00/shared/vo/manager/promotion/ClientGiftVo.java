package trapx00.lightx00.shared.vo.manager.promotion;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.PromotionType;

import java.util.Date;

public class ClientGiftVo extends PromotionVoBase {
    private int clientLevel;
    private PromotionCommodity[] gifts;

    public ClientGiftVo(String id, Date startDate, Date endDate, PromotionState state, int clientLevel, PromotionCommodity[] gifts) {
        super(id, PromotionType.ClientGift, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.gifts = gifts;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(int level) {
        clientLevel = level;
    }

    public PromotionCommodity[] getGifts() {
        return gifts;
    }

    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }
}
