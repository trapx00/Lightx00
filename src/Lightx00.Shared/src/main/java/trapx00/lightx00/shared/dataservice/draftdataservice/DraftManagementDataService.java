package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public interface DraftManagementDataService {
    BillVo[] update();

    ResultMessage delete(BillVo bill);
}
