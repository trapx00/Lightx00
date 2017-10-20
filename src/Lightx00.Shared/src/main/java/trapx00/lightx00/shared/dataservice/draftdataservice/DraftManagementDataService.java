package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVO;

public interface DraftManagementDataService {
    BillVO[] update();
    ResultMessage delete(BillVO bill);
}
