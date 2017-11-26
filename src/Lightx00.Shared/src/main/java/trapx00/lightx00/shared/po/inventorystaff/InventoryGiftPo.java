package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;


@DatabaseTable(tableName = "InventoryGiftBill")
public class InventoryGiftPo {
    @DatabaseField
    private Date time;
    @DatabaseField(id=true)
    private String id;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
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
