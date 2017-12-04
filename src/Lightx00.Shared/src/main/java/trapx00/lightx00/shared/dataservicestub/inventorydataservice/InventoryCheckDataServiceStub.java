package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.InventoryPictureQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryViewQueryVo;

import java.util.Date;

public class InventoryCheckDataServiceStub implements InventoryCheckDataService {
    CommodityPo[] commoditys= new CommodityPo[]{
            new CommodityPo("C0001", "LedLight", "Led", 98, new Date(),
                    "1", "2", 56, 60, 90, 99, 50)
    };
    @Override
    public InventoryViewPo[] getInventoryView(InventoryViewQueryVo inventoryViewQueryVo) {
        return null;
    }
    @Override
    public InventoryPicturePo[] getInventoryPicture(InventoryPictureQueryVo inventoryPictureQueryVo) {
        return null;
    }


}
