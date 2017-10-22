package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryGiftVo;

import java.util.Date;

public class InventoryGiftBlServiceStub implements InventoryGiftBlService {


    @Override
    public InventoryGiftVo sumbit(InventoryGiftVo inventoryGiftVo) {
        Date date=new Date();
        PromotionCommodity pCommodity=new PromotionCommodity();
        PromotionCommodity[] input={null};
        return new InventoryGiftVo(date, "G0001",input);
    }
}
