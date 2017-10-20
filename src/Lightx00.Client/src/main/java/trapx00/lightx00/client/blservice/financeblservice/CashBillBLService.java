package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.CashBillVO;

public interface CashBillBLService {
    ResultMessage submit(CashBillVO bill);
    ResultMessage saveAsDraft(CashBillVO bill);
    CashBillVO resume();
}
