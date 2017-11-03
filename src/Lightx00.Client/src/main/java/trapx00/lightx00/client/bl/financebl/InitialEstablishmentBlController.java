package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.blservice.financeblservice.InitialEstablishmentBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotVo;

public class InitialEstablishmentBlController implements InitialEstablishmentBlService {
    @Override
    public SystemSnapshotVo autofill() {
        return null;
    }

    @Override
    public ResultMessage submit(SystemSnapshotVo snapshot) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(SystemSnapshotVo snapshot) {
        return null;
    }

    @Override
    public SystemSnapshotVo resume() {
        return null;
    }
}
