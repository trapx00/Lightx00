package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public interface DraftManagementBlService {
    BillVo[] update();

    ResultMessage delete(BillVo bill);

    ResultMessage resume(BillVo bill);
}
