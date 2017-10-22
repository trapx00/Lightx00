package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;

public class InitialEstablishmentDataServiceStub implements InitialEstablishmentDataService {
    @Override
    public ResultMessage submit(SystemSnapshotPo snapshot) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(SystemSnapshotPo snapshot) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage abandon(SystemSnapshotPo snapshot) {
        return ResultMessage.Success;
    }
}
