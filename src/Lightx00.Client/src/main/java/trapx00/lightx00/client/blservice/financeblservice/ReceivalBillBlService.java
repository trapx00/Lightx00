package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

public interface ReceivalBillBlService {
    ResultMessage submit(ReceivalBillVo bill);

    ResultMessage saveAsDraft(ReceivalBillVo bill);
    String getId();
}
