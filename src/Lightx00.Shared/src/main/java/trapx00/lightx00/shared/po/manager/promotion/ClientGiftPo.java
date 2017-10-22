package trapx00.lightx00.shared.po.manager.promotion;

import java.util.Date;

public class ClientGiftPo extends PromotionPoBase {
    private int clientLevel;
    private PromotionCommodity[] gifts;

    public ClientGiftPo(String id, Date startDate, Date endDate, PromotionState state, int clientLevel, PromotionCommodity[] gifts) {
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
