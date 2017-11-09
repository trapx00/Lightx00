package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

public class InventoryGiftVo {

    Date time;
    String id;
    PromotionCommodity[] gifts;

    public InventoryGiftVo(Date time, String id, PromotionCommodity[] gifts) {
        this.time = time;
        this.id = id;
        this.gifts = gifts;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PromotionCommodity[] getGifts() {
        return gifts;
    }

    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }

    public void revert() { ;}
}