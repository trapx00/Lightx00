package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;

public interface InitialEstablishmentDataService {
    ResultMessage submit(SystemSnapshotPo snapshot);

    ResultMessage activate(SystemSnapshotPo snapshot);

    ResultMessage abandon(SystemSnapshotPo snapshot);
}
