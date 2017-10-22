package trapx00.lightx00.shared.vo.inventorystaff;

import java.util.Date;

public class InventoryPictureVo {
    //名称，型号，库存数量，库存均价，批次，批号，出厂日期
    Date time;//出厂日期
    CommodityVo[] items;

    public InventoryPictureVo(Date time, CommodityVo[] items) {
        this.time = time;
        this.items = items;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public CommodityVo[] getItems() {
        return items;
    }

    public void setItems(CommodityVo[] items) {
        this.items = items;
    }
}
