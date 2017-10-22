package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

public interface CashBillDataService {
    ResultMessage submit(CashBillPo bill);

    ResultMessage activate(CashBillPo bill);

    ResultMessage abandon(CashBillPo bill);
}
