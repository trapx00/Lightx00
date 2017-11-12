package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;

import java.util.Date;

public class InventoryGiftDataServiceStub implements InventoryGiftDataService {

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

    @Override
    public void init() {

    }
}
