package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

import java.util.Date;

public interface InventoryGiftDataService {
    InventoryGiftPo getGift(Date time);

    void init();
}
