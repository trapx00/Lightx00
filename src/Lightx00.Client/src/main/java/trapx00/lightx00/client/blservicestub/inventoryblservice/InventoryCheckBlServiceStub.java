package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlServiceStub implements InventoryCheckBlService {

    @Override
    public InventoryViewVo check(Date beginTime, Date endTime) {
        return new InventoryViewVo(new Date(), 90, 80,
       50, 100, 208,
       60, 100);
    }

    @Override
    public InventoryPictureVo picture() {
        Date date=new Date();
        CommodityVo[] commoditys= new CommodityVo[]{
                new CommodityVo("C0001", "LedLight", "Led", 98, date,
                        "1", "2", 56, 60, 90, 99, 50)
        };
        return new InventoryPictureVo(date, commoditys);
    }

    @Override
    public ResultMessage export(File newfile) {
        return ResultMessage.Success;
    }
}
