package trapx00.lightx00.client.vo.inventorystaff;

import trapx00.lightx00.shared.po.inventorystaff.CommodityItem;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPictureItem;

import java.util.Date;

public class InventoryPictureVo {
    //名称，型号，库存数量，库存均价，批次，批号，出厂日期
    private Date time;//出厂日期
    private InventoryPictureItem[] items;

    public InventoryPictureVo(Date time, InventoryPictureItem[] items) {
        this.time = time;
        this.items = items;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public InventoryPictureItem[] getItems() {
        return items;
    }

    public void setItems(InventoryPictureItem[] items) {
        this.items = items;
    }
}
