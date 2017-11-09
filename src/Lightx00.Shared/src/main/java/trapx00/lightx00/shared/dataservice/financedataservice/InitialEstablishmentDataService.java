package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InitialEstablishmentDataService extends Remote {
    /**
     * Submits a snapshot.
     * @param snapshot snapshot to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SystemSnapshotPo snapshot) throws RemoteException;


    /**
     * Activates a SystemSnapshot.
     * @param id id for the SystemSnapshot
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
     * @return id for the next snapshot
     */
    String getId() throws RemoteException;

    /**
     * Queries SystemSnapshot.
     * @param query query
     * @return SystemSnapshotVos that match the condition
     */
    SystemSnapshotPo[] query(SystemSnapshotQueryVo query) throws RemoteException;
}
