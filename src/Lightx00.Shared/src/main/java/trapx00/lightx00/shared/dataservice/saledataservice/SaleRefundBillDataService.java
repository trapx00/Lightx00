package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;
import trapx00.lightx00.shared.queryvo.SaleBillQueryVo;
import trapx00.lightx00.shared.queryvo.SaleRefundBillQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleRefundBillDataService extends Remote {

    /**
     * Activates a SaleRefundBill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Abandons a SaleRefundBill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the bill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Queries SaleRefundBill.
     *
     * @param query query condition
     * @return SaleRefundBillPos that match the query condition
     */
    SaleRefundBillPo[] query(SaleRefundBillQueryVo query) throws RemoteException;

    /**
     * Submits a SaleRefundBillPo or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     *    if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param saleRefundBill purchaseBill
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleRefundBillPo saleRefundBill) throws RemoteException;//提交销售退货单

    /**
     * get the id of the next sale refund bill
     *
     * @return the id of the next sale refund bill
     */
    String getId() throws RemoteException;
}