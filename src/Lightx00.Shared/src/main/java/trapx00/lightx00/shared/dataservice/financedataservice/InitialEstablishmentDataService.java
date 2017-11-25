package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InitialEstablishmentDataService extends Remote {
    /**
     * Submits a SystemSnapshotPo or save it as a draft.
     * If there is a SystemSnapshotPo with the same id as passed-in parameter do,
     *    if the existing SystemSnapshotPo is in BillState.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param snapshot snapshot
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SystemSnapshotPo snapshot) throws RemoteException;


    /**
     * Abandons a SystemSnapshotPo.
     * If a snapshot is in BillState.Draft, it will be deleted.
     * If a snapshot is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a snapshot is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    ResultMessage activate(String id) throws RemoteException;

    /**
     * Deletes a draft.
     * @param id id for a draft
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id) throws RemoteException;

    /**
     * Gets the id for the next snapshot.
     * If there are already 99999 snapshot for this day, a NoMoreBillException will be thrown.
     *
     * @return id for the next snapshot
     */
    String getId() throws RemoteException;

    /**
     * Changes the state of a bill if approval is completed.
     * @param billId the id of the bill.
     * @param billState new bill state. Only Approved and Rejected is allowed.
     * @return whether the operation is done successfully.
     */
    ResultMessage approvalComplete(String billId, BillState billState) throws RemoteException;
    /**
     * Queries SystemSnapshotPos.
     *
     * @param query query
     * @return SystemSnapshotPos that match query condition
     */
    SystemSnapshotPo[] query(SystemSnapshotQueryVo query) throws RemoteException;
}
