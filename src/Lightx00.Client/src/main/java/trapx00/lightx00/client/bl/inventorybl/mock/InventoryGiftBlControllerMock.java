package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

public class InventoryGiftBlControllerMock extends InventoryGiftBlController{
    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return ResultMessage.Success;
    }
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
    public InventoryGiftVo getGift(Date time) {
        return super.getGift(new Date());
    }

    /**
     * Query a commoditybl
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
