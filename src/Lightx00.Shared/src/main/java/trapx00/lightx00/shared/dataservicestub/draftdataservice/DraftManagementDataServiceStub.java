package trapx00.lightx00.shared.dataservicestub.draftdataservice;

import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.po.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import java.rmi.RemoteException;
import java.util.Date;

public class DraftManagementDataServiceStub implements DraftManagementDataService {

    /**
     * Updates current user's drafts.
     *
     * @param query
     * @return curent user's drafts
     */
    @Override
    public DraftPo[] update(DraftQueryVo query) throws RemoteException {
        return new DraftPo[] {
                new DraftPo("FXD-123",new Date(),"123","FXD-20171111-00001")
        };
    }

    /**
     * Deletes a draft.
     *
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String draftId) {
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
