package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlControllerMock extends InventoryCheckBlController {
    /**
     * Checks the invenntory change during specified time range
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */

    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */

    /**
     * Exports the inventory snapshot to the required file by excel
     * @param newfile
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(String newfile) {
        return super.export(newfile);
    }
}
