package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.queryvo.PaymentBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PaymentBillDataService extends Remote {

    /**
     * Submits a PaymentBill or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     *    if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param bill bill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PaymentBillPo bill) throws RemoteException;

    /**
     * Activates a PaymentBill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a PaymentBill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries PaymentBills.
     *
     * @param query query
     * @return PaymentBillVos that match query condition
     */
    PaymentBillPo[] query(PaymentBillQueryVo query) throws RemoteException;

    /**
     * Gets the id for the next bill.
     * If there are already 99999 bills for this day, a NoMoreBillException will be thrown.
     *
     * @return id for the next bill
     */
    String getId() throws RemoteException;
}
