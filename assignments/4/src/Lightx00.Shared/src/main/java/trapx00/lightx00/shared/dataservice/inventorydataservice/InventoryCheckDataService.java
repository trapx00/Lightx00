package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.util.Date;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

public interface InventoryCheckDataService {

    InventoryViewPo submit(Date beginTime,Date endTime);

    InventoryPicturePo submit(Date time);

    void init();
}
