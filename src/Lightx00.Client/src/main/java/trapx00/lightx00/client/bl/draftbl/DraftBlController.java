package trapx00.lightx00.client.bl.draftbl;

import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.Draftable;

public class DraftBlController implements DraftManagementBlService, DraftService {

    /**
     * Saves a draftable as a draft.
     * @param draft draft
     * @return
     */
    @Override
    public ResultMessage saveAsDraft(Draftable draft) {
        return null;
    }

    /**
     * Updates current users' drafts.
     * @return Current users' drafts
     */

    @Override
    public Draftable[] update() {
        return new Draftable[0];
    }

    /**
     * Deletes a draft.
     * @param draft draft to be deleted
     * @return whether operation is done successfully
     */

    @Override
    public ResultMessage delete(Draftable draft) {
        return null;
    }
}
