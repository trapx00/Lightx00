package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;

public interface CashBillBlService {

    ResultMessage submit(CashBillVo bill);

    ResultMessage saveAsDraft(CashBillVo bill);

    CashBillVo resume();
}
