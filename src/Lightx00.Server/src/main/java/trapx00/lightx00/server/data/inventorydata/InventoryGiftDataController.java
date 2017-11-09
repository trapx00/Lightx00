package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

import java.util.Date;

public class InventoryGiftDataController implements InventoryGiftDataService {
    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftPo getGift(Date time) {
        return null;
    }
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return null;
    }

    @Override
    public void init() {

    }
}
