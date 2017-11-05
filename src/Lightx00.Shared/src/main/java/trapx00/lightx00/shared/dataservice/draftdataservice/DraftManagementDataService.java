package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.Draftable;

public interface DraftManagementDataService {
    /**
     * Updates current user's drafts.
     * @return curent user's drafts
     */
    Draftable[] update();

    /**
     * Deletes a draft.
     * @param draftId id for the draft to be deleted
     * @return whether the operation is done successfully
     */

    ResultMessage delete(String draftId);

    /**
     * Adds a draft.
     * @param draft draft to be added
     * @return whether the operation is done successfully
     */
    ResultMessage add(String draft);
}
