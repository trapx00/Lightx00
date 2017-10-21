package trapx00.lightx00.shared.po.inventorystaff;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

import java.util.Date;

public class InventoryGiftPo{
    Date time;
    String Id;
    PromotionCommodity[] gifts;

    public InventoryGiftPo(Date time, String Id, PromotionCommodity[] gifts) {
        this.time = time;
        this.Id = Id;
        this.gifts = gifts;
    }
}
