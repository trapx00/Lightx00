package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePO;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPO;

import java.util.Date;

public interface InventoryCheckDataService{
    public InventoryViewPO submit(Date beginTime,Date endTime);
    public InventoryPicturePO submit(Date time);
    public void init();
}
