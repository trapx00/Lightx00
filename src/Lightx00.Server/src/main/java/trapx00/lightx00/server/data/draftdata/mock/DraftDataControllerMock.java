package trapx00.lightx00.server.data.draftdata.mock;

import trapx00.lightx00.server.data.draftdata.DraftDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.Draftable;

public class DraftDataControllerMock extends DraftDataController {
    /**
     * Updates current user's drafts.
     *
     * @return curent user's drafts
     */
    @Override
    public Draftable[] update() {
        return super.update();
    }

    /**
     * Deletes a draft.
     *
     * @param draft draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(Draftable draft) {
        return super.delete(draft);
    }

    /**
     * Adds a draft.
     *
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(Draftable draft) {
        return super.add(draft);
    }
}
