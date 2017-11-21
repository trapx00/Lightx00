package trapx00.lightx00.server.data.draftdata.mock;

import trapx00.lightx00.server.data.draftdata.DraftDataController;
import trapx00.lightx00.shared.dataservicestub.draftdataservice.DraftManagementDataServiceStub;
import trapx00.lightx00.shared.po.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.util.Date;

public class DraftDataControllerMock extends DraftDataController {


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
    public DraftDataControllerMock() throws RemoteException {
    }
    /**
     * Updates current user's drafts.
     *
     * @param query
     * @return curent user's drafts
     */
    @Override
    public DraftPo[] update(DraftQueryVo query) throws RemoteException {
        return new DraftPo[] {
                new DraftPo(new Date(),"123","FXD-20171111-00001")
        };
    }

    /**
     * Deletes a draft.
     *
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(int draftId) {
        return ResultMessage.Success;
    }

    /**
     * Adds a draft.
     *
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(String draft) {
        return ResultMessage.Success;
    }

}
