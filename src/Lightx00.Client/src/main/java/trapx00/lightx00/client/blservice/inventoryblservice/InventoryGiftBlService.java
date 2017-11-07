package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;

import javax.xml.crypto.Data;

public interface InventoryGiftBlService {
    /**
     * Submits a GiftBill.
     * @param inventoryGiftVo
     * @return whether the operation is done successfully
     */
    ResultMessage sumbit(InventoryGiftVo inventoryGiftVo);//提交赠送单

    /**
     *  Gets the id for the next GiftBill
     * @return the id
     */
    String getId();

    /**
     * Gets the giftBill during the time
     * @param time
     * @return the giftBill
     */
    InventoryGiftVo getGift(Data time);



}
