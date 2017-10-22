package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

public class InventoryGiftPo {
    private Date time;
    private String id;
    private  PromotionCommodity[] gifts;

    public InventoryGiftPo(Date time, String id, PromotionCommodity[] gifts) {
        this.time = time;
        this.id = id;
        this.gifts = gifts;
    }

    public Date getTime() {
        return time;
    }

    public String getId() {
        return id;
    }

    public PromotionCommodity[] getGifts() {
        return gifts;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }
}
