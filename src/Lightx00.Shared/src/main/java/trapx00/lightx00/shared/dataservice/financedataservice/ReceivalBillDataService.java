package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.shared.queryvo.ReceivalBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReceivalBillDataService extends Remote {

    /**
     * Submits a ReceivalBill or save it as a draft.
     * @param bill ReceivalBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ReceivalBillPo bill) throws RemoteException;

    /**
     * Activates a ReceivalBill.
     * @param id id for the ReceivalBill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a ReceivalBill.
     * @param id id for the ReceivalBill to be abandoned
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries bills
     * @param query query
     * @return ReceivalBillVos that match query condition
     */
    ReceivalBillPo[] query(ReceivalBillQueryVo query) throws RemoteException;

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId() throws RemoteException;

}
