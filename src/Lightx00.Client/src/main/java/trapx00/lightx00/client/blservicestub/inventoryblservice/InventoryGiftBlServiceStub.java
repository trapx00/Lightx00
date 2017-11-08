package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;

import javax.xml.crypto.Data;
import java.util.Date;

public class InventoryGiftBlServiceStub implements InventoryGiftBlService {


    @Override
    public InventoryGiftVo sumbit(InventoryGiftVo inventoryGiftVo) {
        Date date=new Date();
        PromotionCommodity pCommodity=new PromotionCommodity();
        PromotionCommodity[] input={null};
        return new InventoryGiftVo(date, "G0001",input);
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public InventoryGiftVo getGift(Data time) {
        return null;
    }


}
