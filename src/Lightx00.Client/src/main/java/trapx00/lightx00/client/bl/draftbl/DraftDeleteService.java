package trapx00.lightx00.client.bl.draftbl;

import trapx00.lightx00.shared.po.ResultMessage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DraftDeleteService {
    /**
     * Deletes a draft.
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage deleteDraft(String id);
}
