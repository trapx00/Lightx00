package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.DraftVo;
import trapx00.lightx00.shared.vo.Draftable;

public interface DraftManagementBlService {
    /**
     * Updates current user's draft.
     * @return Current User's draft
     */
    DraftVo[] update();

    /**
     * Deletes a draft.
     * @param draft draft to be deleted
     * @return whether the operation is done successfully
     */

    ResultMessage delete(Draftable draft);
}
