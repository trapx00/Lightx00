package trapx00.lightx00.client.bl.draftbl.mock;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.Draftable;

public class DraftBlControllerMock extends DraftBlController {
    /**
     * Saves a draftable as a draft.
     *
     * @param draft draft
     * @return whether operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(Draftable draft) {
        return super.saveAsDraft(draft);
    }

    /**
     * Updates current user's draft.
     *
     * @return Current User's draft
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
}
