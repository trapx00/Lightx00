package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
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
    /**
     * Changes the state of a bill if approval is completed.
     * @param billId the id of the bill.
     * @param billState new bill state. Only Approved and Rejected is allowed.
     * @return whether the operation is done successfully.
     */
    ResultMessage approvalComplete(String billId, BillState billState) throws RemoteException;

}
