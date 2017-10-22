package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public interface RevertBillBlService {
    ResultMessage init(BillVo bill);
}
