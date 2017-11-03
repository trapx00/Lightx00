package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.Draftable;

public interface DraftManagementBlService {
    Draftable[] update();

    ResultMessage delete(Draftable draft);
}
