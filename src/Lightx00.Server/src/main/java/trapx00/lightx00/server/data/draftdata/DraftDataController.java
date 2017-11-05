package trapx00.lightx00.server.data.draftdata;

import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.Draftable;

public class DraftDataController implements DraftManagementDataService {
    /**
     * Updates current user's drafts.
     *
     * @return curent user's drafts
     */
    @Override
    public Draftable[] update() {
        return new Draftable[0];
    }

    /**
     * Deletes a draft.
     *
     * @param draft draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(Draftable draft) {
        return null;
    }

    /**
     * Adds a draft.
     *
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(Draftable draft) {
        return null;
    }
}
