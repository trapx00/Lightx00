package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

public class InventoryPicturePo {
    //名称，型号，库存数量，库存均价，批次，批号，出厂日期
    Date time;
    CommodityPo[] items;

    public InventoryPicturePo(Date time, CommodityPo[] items) {
        this.time = time;
        this.items = items;
    }

    public Date getTime() {
        return time;
    }

    public CommodityPo[] getItems() {
        return items;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setItems(CommodityPo[] items) {
        this.items = items;
    }
}
