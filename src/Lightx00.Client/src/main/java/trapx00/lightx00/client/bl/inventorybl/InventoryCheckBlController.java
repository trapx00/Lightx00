package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlController implements InventoryCheckBlService {
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewVo check(Date beginTime, Date endTime) {
        return null;
    }

    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPictureVo picture() {
        return null;
    }

    /**
     * Exports the inventory snapshot to the required file by excel
     * @param newfile
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(File newfile) {
        return null;
    }
}
