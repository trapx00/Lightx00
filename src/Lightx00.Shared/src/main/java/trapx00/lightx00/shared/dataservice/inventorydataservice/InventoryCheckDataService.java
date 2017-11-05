package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.util.Date;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

public interface InventoryCheckDataService {
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    InventoryViewPo submit(Date beginTime,Date endTime);

    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    InventoryPicturePo submit(Date time);

    void init();
}
