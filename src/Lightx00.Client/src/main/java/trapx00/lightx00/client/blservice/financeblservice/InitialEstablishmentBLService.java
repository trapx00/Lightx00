package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotVo;

public interface InitialEstablishmentBlService {

    SystemSnapshotVo autofill();

    ResultMessage submit(SystemSnapshotVo snapshot);

    ResultMessage saveAsDraft(SystemSnapshotVo snapshot);

    SystemSnapshotVo resume();

}
