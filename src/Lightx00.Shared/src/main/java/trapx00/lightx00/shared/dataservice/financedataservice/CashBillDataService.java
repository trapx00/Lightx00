package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CashBillDataService extends Remote {
    /**
     * Submits a CashBill or save it as a draft.
     * @param bill CashBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(CashBillPo bill) throws RemoteException;


    /**
     * Activates a CashBill.
     * @param id id for the CashBill that have been approved of
     * @return whether the operation is done successfully
     */

    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a CashBill.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries CashBill.
     * @param query query condition
     * @return CashBillVos that match the query condition
     */

    CashBillPo[] query(CashBillQueryVo query) throws RemoteException;

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId() throws RemoteException;
}
