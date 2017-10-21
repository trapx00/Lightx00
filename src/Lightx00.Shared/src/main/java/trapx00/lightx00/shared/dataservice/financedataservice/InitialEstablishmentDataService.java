package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPO;

public interface InitialEstablishmentDataService {
    ResultMessage submit(SystemSnapshotPO snapshot);
    ResultMessage activate(SystemSnapshotPO snapshot);
    ResultMessage abandon(SystemSnapshotPO snapshot);
}
