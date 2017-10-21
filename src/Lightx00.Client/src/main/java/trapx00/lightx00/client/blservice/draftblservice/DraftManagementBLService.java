package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVO;

public interface DraftManagementBLService {
    BillVO[] update();
    ResultMessage delete(BillVO bill);
    ResultMessage resume(BillVO bill);
}
