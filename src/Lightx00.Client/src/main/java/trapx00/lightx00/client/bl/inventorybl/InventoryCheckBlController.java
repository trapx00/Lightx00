package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

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
        InventoryViewVo inventoryViewVo=new InventoryViewVo(beginTime,123,123,123,12,208,123,123);

        return inventoryViewVo;
    }

    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPictureVo picture() {

        CommodityVo LedLight=new CommodityVo("C0001","LedLight", "Led", 98, new Date(),
                "1", "2", 56, 60, 90, 99, 50);

        CommodityVo[] commoditys={LedLight};

        return new InventoryPictureVo(new Date(),commoditys);
    }

    /**
     * Exports the inventory snapshot to the required file by excel
     * @param newfile
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(File newfile) {
        return ResultMessage.Success;
    }



}
