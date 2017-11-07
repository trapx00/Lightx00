package trapx00.lightx00.server.data.draftdata.mock;

import trapx00.lightx00.server.data.draftdata.DraftDataController;
import trapx00.lightx00.shared.po.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;

public class DraftDataControllerMock extends DraftDataController {
    /**
     * Updates current user's drafts.
     *
     * @return curent user's drafts
     */
    @Override
    public DraftPo[] update() {
        return super.update();
    }

    /**
     * Deletes a draft.
     *
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String draftId) {
        return super.delete(draftId);
    }

    /**
     * Adds a draft.
     *
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(String draft) {
        return super.add(draft);
    }
}
