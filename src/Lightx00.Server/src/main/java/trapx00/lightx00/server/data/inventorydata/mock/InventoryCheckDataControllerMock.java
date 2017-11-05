package trapx00.lightx00.server.data.inventorydata.mock;

import trapx00.lightx00.server.data.inventorydata.InventoryCheckDataController;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.util.Date;

public class InventoryCheckDataControllerMock extends InventoryCheckDataController {
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewPo submit(Date beginTime, Date endTime) {
        return super.submit(beginTime, endTime);
    }
    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPicturePo submit(Date time) {
        return super.submit(time);
    }

}
