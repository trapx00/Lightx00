package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.queryvo.PaymentBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PaymentBillDataService extends Remote{
    /**
     * Submits a bill or saves a bill as a draft
     * @param bill PaymentBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PaymentBillPo bill) throws RemoteException;

    /**
     * Activates a bill.
     * @param id id for the PaymentBill that have been approved of
     * @return whether the operation is done successfully
     */

    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a bill.
     * @param id id for the PaymentBill to be abandoned
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries bills
     * @param query query
     * @return PaymentBillVos that match query condition
     */

    PaymentBillPo[] query(PaymentBillQueryVo query) throws RemoteException;

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId() throws RemoteException;
}
