package trapx00.lightx00.shared.vo.inventorystaff;


import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

import java.util.Date;


public class InventoryGiftVo{
    Date time;
    String Id;
    PromotionCommodity[] gifts;

    public InventoryGiftVo(Date time, String Id, PromotionCommodity[] gifts) {
        this.time = time;
        this.Id = Id;
        this.gifts = gifts;
    }
}