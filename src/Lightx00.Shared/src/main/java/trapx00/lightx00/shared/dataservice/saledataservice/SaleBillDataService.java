package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.queryvo.SaleBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleBillDataService extends Remote {

    /**
     * Activates a SaleBill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a SaleBill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries SaleBill.
     *
     * @param query query condition
     * @return SaleBillPos that match the query condition
     */
    SaleBillPo[] query(SaleBillQueryVo query) throws RemoteException;

    /**
     * Submits a SaleBillPo or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     * if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     * otherwise a IdExistsException would be thrown.
     *
     * @param saleBill purchaseBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleBillPo saleBill) throws RemoteException;//提交销售单

    /**
     * get the id of the next sale bill
     *
     * @return the id of the next sale bill
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