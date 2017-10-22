package trapx00.lightx00.shared.dataservice.draftdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.vo.BillVo;

public interface DraftManagementDataService {
    BillPo[] update();

    ResultMessage delete(BillPo bill);
}
