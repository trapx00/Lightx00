package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.DraftPo;
import trapx00.lightx00.shared.po.ResultMessage;

public interface DraftManagementDataService {
    /**
     * Updates current user's drafts.
     * @return curent user's drafts
     */
    DraftPo[] update();

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
