package trapx00.lightx00.shared.po.manager.promotion;

public class ClientGiftPo extends PromotionPoBase {
    int clientLevel;
    PromotionCommodity[] gifts;

    public ClientGiftPo(String Id, String startDate, String endDate, PromotionState state, int clientLevel, PromotionCommodity[] gifts) {
        super(Id, PromotionType.ClientGift, startDate, endDate, state);
        this.clientLevel = clientLevel;
        this.gifts = gifts;
    }
}
