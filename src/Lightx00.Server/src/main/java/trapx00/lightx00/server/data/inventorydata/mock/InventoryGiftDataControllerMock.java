package trapx00.lightx00.server.data.inventorydata.mock;

import trapx00.lightx00.server.data.inventorydata.InventoryGiftDataController;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

import java.util.Date;

public class InventoryGiftDataControllerMock extends InventoryGiftDataController {
    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftPo getGift(Date time) {
        return super.getGift(time);
    }
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return super.getId();
    }
}
