package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DraftManagementDataService extends Remote {
    /**
     * Updates current user's drafts.
     * @return curent user's drafts
     */
    DraftPo[] update(DraftQueryVo query) throws RemoteException;

    /**
     * Deletes a draft.
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */

    ResultMessage delete(int draftId) throws RemoteException;

    /**
     * Adds a draft.
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    ResultMessage add(String draft) throws RemoteException;
}
