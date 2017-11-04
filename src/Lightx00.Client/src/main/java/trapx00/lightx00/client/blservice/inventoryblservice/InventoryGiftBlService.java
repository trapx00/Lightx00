package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryGiftVo;

import javax.xml.crypto.Data;

public interface InventoryGiftBlService {
    /**
     *
     * @param inventoryGiftVo
     * @return
     */
    InventoryGiftVo sumbit(InventoryGiftVo inventoryGiftVo);//提交赠送单

    /**
     *
     * @return
     */
    String getId();

    /**
     *
     * @param time
     * @return
     */
    InventoryGiftVo getGift(Data time);

    /**
     *
     * @return
     */
    public CommodityVo[] getAllCommodity();



}
