package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.util.Date;

public class InventoryCheckDataServiceStub implements InventoryCheckDataService {
    CommodityPo[] commoditys= new CommodityPo[]{
            new CommodityPo("C0001", "LedLight", "Led", 98, new Date(),
                    "1", "2", 56, 60, 90, 99, 50)
    };
    @Override
    public InventoryViewPo submit(Date beginTime, Date endTime) {
        return new InventoryViewPo(new Date(), 90, 80,
                50, 100, 208,
                60, 100);    }

    @Override
    public InventoryPicturePo submit(Date time) {
        return new InventoryPicturePo(new Date(),commoditys);
    }

    @Override
    public void init() {

    }
}
