package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPO;

public interface CashBillDataService {
    ResultMessage submit(CashBillPO bill);
    ResultMessage activate(CashBillPO bill);
    ResultMessage abandon(CashBillPO bill);
}
