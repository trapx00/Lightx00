package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.util.Date;

public class InventoryCheckDataController implements InventoryCheckDataService {
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewPo submit(Date beginTime, Date endTime) {
        return null;
    }
    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPicturePo submit(Date time) {
        return null;
    }

    @Override
    public void init() {

    }
}
