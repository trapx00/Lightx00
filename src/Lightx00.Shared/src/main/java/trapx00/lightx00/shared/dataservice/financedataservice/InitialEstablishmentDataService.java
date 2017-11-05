package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;

public interface InitialEstablishmentDataService {
    /**
     * Submits a snapshot.
     * @param snapshot snapshot to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SystemSnapshotPo snapshot);

    /**
     * Deletes a draft.
     * @param id id for a draft
     * @return whether the operation is done successfully
     */

    ResultMessage abandon(String id);

    /**
     * Gets the id for the next snapshot.
     * @return id for the next snapshot
     */
    String getId();
}
