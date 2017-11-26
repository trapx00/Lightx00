package trapx00.lightx00.server.data.inventorydata.mock;

import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryGiftDataServiceStub;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

import java.rmi.RemoteException;
import java.util.Date;

public class InventoryGiftDataControllerMock extends InventoryGiftDataServiceStub {

    public InventoryGiftDataControllerMock() throws RemoteException {
    }

    @Override
    public InventoryGiftPo getGift(Date time) {
        Date date=new Date();
        PromotionCommodity pCommodity=new PromotionCommodity();
        PromotionCommodity[] input={null};
        return new InventoryGiftPo(date, "G0001",input);
    }

    @Override
    public String getId() {
        return "X0001";
    }



}
