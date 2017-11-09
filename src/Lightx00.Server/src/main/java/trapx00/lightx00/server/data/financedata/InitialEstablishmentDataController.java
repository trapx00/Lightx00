package trapx00.lightx00.server.data.financedata;

import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class InitialEstablishmentDataController extends UnicastRemoteObject implements InitialEstablishmentDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    protected InitialEstablishmentDataController() throws RemoteException {
    }

    /**
     * Submits a snapshot.
     *
     * @param snapshot snapshot to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SystemSnapshotPo snapshot) {
        return null;
    }

    /**
     * Activates a SystemSnapshot.
     *
     * @param id id for the SystemSnapshot
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Deletes a draft.
     *
     * @param id id for a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Gets the id for the next snapshot.
     *
     * @return id for the next snapshot
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Queries SystemSnapshot.
     *
     * @param query query
     * @return SystemSnapshotVos that match the condition
     */
    @Override
    public SystemSnapshotPo[] query(SystemSnapshotQueryVo query) {
        return new SystemSnapshotPo[0];
    }
}
