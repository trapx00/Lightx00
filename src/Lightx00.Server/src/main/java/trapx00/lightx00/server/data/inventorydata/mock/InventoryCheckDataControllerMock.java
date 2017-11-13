package trapx00.lightx00.server.data.inventorydata.mock;

import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryCheckDataServiceStub;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.rmi.RemoteException;
import java.util.Date;

public class InventoryCheckDataControllerMock extends InventoryCheckDataServiceStub {

    public InventoryCheckDataControllerMock() throws RemoteException {
    }

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
