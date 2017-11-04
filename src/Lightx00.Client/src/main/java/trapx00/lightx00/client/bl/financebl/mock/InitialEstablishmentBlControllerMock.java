package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.InitialEstablishmentBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotVo;

public class InitialEstablishmentBlControllerMock extends InitialEstablishmentBlController {
    /**
     * Auto fills some contents with current system state.
     *
     * @return SystemSnapshot with current system state
     */
    @Override
    public SystemSnapshotVo autofill() {
        return super.autofill();
    }

    /**
     * Submits the system snapshot.
     *
     * @param snapshot SystemSnapVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SystemSnapshotVo snapshot) {
        return super.submit(snapshot);
    }

    /**
     * Saves a half-completed system snapshot as a draft.
     *
     * @param snapshot SystemSnapshotVo to be saved as draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SystemSnapshotVo snapshot) {
        return super.saveAsDraft(snapshot);
    }
}
