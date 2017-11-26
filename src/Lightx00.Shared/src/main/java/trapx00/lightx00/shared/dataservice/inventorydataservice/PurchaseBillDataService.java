package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PurchaseBillDataService extends Remote {

    /**
     * Activates a PurchaseBill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a PurchaseBill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries PurchaseBill.
     *
     * @param query query condition
     * @return PurchaseBillPos that match the query condition
     */
    PurchaseBillPo[] query(PurchaseBillQueryVo query) throws RemoteException;

    /**
     * Submits a PurchaseBillPo or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     * if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     * otherwise a IdExistsException would be thrown.
     *
     * @param purchaseBill purchaseBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PurchaseBillPo purchaseBill) throws RemoteException;//提交进货单

    /**
     * get the id of the next purchase bill
     *
     * @return the id of the next purchase bill
     */
    String getId() throws RemoteException;

    /**
     * Changes the state of a bill if approval is completed.
     *
     * @param billId    the id of the bill.
     * @param billState new bill state. Only Approved and Rejected is allowed.
     * @return whether the operation is done successfully.
     */
    ResultMessage approvalComplete(String billId, BillState billState) throws RemoteException;
}