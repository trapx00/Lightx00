package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPO;

import java.util.Date;

public interface InventoryGiftDataService {
    public InventoryGiftPO getGift(Date time);
    public void init();
}
