package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.util.Date;

import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

public interface InventoryGiftDataService {

    InventoryGiftPo getGift(Date time);

    void init();
}
