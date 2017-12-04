package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlControllerMock extends InventoryCheckBlController {
    @Override
    public InventoryViewVo fromPoToVo(InventoryViewPo po) {
        return super.fromPoToVo(po);
    }

    @Override
    public InventoryViewPo fromVoToPo(InventoryViewVo vo) {
        return super.fromVoToPo(vo);
    }

    /**
     * Checks the invenntory change between the begintime and endtime
     *
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time rangeget
     */
    @Override
    public InventoryViewVo[] getInventoryView(Date beginTime, Date endTime) {
        return super.getInventoryView(beginTime, endTime);
    }

    /**
     * Gets the inventory snapshot
     *
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPictureVo[] getInventoryPicture() {
        return super.getInventoryPicture();
    }

    /**
     * Exports the inventory snapshot to the required file by excel
     *
     * @param newfile
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(File newfile) {
        return super.export(newfile);
    }
}
