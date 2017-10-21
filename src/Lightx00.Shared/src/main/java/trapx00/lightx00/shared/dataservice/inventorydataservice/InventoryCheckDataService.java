package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.util.Date;

public interface InventoryCheckDataService {

    InventoryViewPo submit(Date beginTime,Date endTime);

    InventoryPicturePo submit(Date time);

    void init();
}
