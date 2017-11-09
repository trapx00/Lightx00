package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.rmi.Remote;
import java.util.Date;

import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

public interface InventoryGiftDataService extends Remote {

    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    InventoryGiftPo getGift(Date time);
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId();

    void init();
}
