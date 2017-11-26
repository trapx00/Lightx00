package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InventoryWarningDataService extends Remote {
    /**
     * Submits a bill
     * @param bill
     * @return  whether the operation is done successfully
     */
    ResultMessage submit(InventoryDetailBillPo bill);

    /**
     *  Modifys the warning value of the commoditybl
     * @param id
     * @param warningValue
     * @return  whether the operation is done successfully
     */
    ResultMessage modify(String id, double warningValue);//修改警戒值
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


    /**
     *  Querys a bill
     * @param inventoryBillQueryVo
     * @return InventoryBillVo
     */
    InventoryDetailBillPo[]query(InventoryBillQueryVo inventoryBillQueryVo);

    /**
     * Activates a Bill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a Bill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id) throws RemoteException;


}
