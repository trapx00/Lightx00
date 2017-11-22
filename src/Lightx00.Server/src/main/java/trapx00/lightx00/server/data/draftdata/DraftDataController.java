package trapx00.lightx00.server.data.draftdata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.draftdata.factory.DraftDataDaoFactory;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.po.draft.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class DraftDataController extends UnicastRemoteObject implements DraftManagementDataService {


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
    protected DraftDataController() throws RemoteException {
    }

    private Dao<DraftPo, Integer> dao = DraftDataDaoFactory.getDao();

    /**
     * Updates current user's drafts.
     *
     * @param query query
     * @return curent user's drafts
     */
    @Override
    public DraftPo[] update(DraftQueryVo query) throws RemoteException {
        return new DraftPo[0];
    }

    /**
     * Deletes a draft.
     *
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(int draftId) throws RemoteException {
        return null;
    }


    /**
     * Adds a draft.
     *
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(String draft) {
        return null;
    }
}
