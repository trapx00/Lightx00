package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPO;
import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotVO;

public interface InitialEstablishmentBLService {
    SystemSnapshotVO autofill();
    ResultMessage submit(SystemSnapshotVO snapshot);
    ResultMessage saveAsDraft(SystemSnapshotVO snapshot);
    SystemSnapshotVO resume();

}
