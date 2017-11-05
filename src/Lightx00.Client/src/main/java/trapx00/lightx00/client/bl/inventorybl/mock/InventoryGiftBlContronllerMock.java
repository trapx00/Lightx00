package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryGiftVo;

import javax.xml.crypto.Data;

public class InventoryGiftBlContronllerMock extends InventoryGiftBlController{
    /**
     * Submits a GiftBill.
     * @param inventoryGiftVo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage sumbit(InventoryGiftVo inventoryGiftVo) {
        return super.sumbit(inventoryGiftVo);
    }

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return super.getId();
    }

    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftVo getGift(Data time) {
        return super.getGift(time);
    }

    /**
     * Query a commodity
     * @param commodityQueryVo
     * @return CommodityVo that match to the requirement
     */
    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo) {
        return  super.queryCommodity(commodityQueryVo);
    }
    /**
     * Abandons a bill.
     * @param id id for the bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return super.abandon(id);
    }
    /**
     *  Activates a bill that has been approved of.
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return super.activate(id);
    }
}
