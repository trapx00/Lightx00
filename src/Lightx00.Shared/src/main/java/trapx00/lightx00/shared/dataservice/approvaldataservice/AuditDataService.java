package trapx00.lightx00.shared.dataservice.approvaldataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.BillInfoPo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuditDataService extends Remote {
    /**
     * Filter some BillInfoPo.
     * @param query the filter conditions
     * @return array of BillInfoPo which match the conditions
     */
    BillInfoPo[] query(BillInfoQueryVo query) throws RemoteException;

    /**
     * Delete BillInfoPo after approving.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    ResultMessage pass(BillInfoPo billInfo) throws RemoteException;

    /**
     * Delete BillInfoPo after rejecting the approval.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    ResultMessage reject(BillInfoPo billInfo) throws RemoteException;

    /**
     * Save the submitted bill.
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    ResultMessage requestApproval(BillPo bill) throws RemoteException;
}
