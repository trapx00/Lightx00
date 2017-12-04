package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlServiceStub implements InventoryCheckBlService {

    /**
     * Checks the invenntory change between the begintime and endtime
     *
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewVo[] getInventoryView(Date beginTime, Date endTime) {
        return new InventoryViewVo[] { new InventoryViewVo("123",new Date(), null)};
    }

    /**
     * Gets the inventory snapshot
     *
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPictureVo[] getInventoryPicture() {
        Date date=new Date();
        CommodityVo[] commoditys= new CommodityVo[]{
            new CommodityVo("C0001", "LedLight", "Led", 98, date,
                "1", "2", 56, 60, 90, 99, 50)
        };
        return new InventoryPictureVo[] { new InventoryPictureVo(date, commoditys) };
    }

    @Override
    public ResultMessage export(File newfile) {
        return ResultMessage.Success;
    }
}
