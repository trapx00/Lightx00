package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;

public class InitialEstablishmentDataServiceStub implements InitialEstablishmentDataService {
    /**
     * Submits a snapshot.
     *
     * @param snapshot snapshot to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SystemSnapshotPo snapshot) {
        return null;
    }

    /**
     * Activates a SystemSnapshot.
     *
     * @param id id for the SystemSnapshot
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }

    /**
     * Deletes a draft.
     *
     * @param id id for a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }

    /**
     * Gets the id for the next snapshot.
     *
     * @return id for the next snapshot
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Queries SystemSnapshot.
     *
     * @param query query
     * @return SystemSnapshotVos that match the condition
     */
    @Override
    public SystemSnapshotPo[] query(SystemSnapshotQueryVo query) {
        return new SystemSnapshotPo[0];
    }


}
