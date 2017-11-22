package trapx00.lightx00.client.bl.draftbl;

import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.draft.DraftVo;
import trapx00.lightx00.client.vo.Draftable;

public class DraftBlController implements DraftManagementBlService, DraftService {

    /**
     * Saves a draftable as a draft.
     *
     * @param draft draft
     * @return whether operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(Draftable draft) {
        return null;
    }

    /**
     * Updates current user's draft.
     *
     * @return Current User's draft
     */
    @Override
    public DraftVo[] update() {
        return new DraftVo[0];
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
}
