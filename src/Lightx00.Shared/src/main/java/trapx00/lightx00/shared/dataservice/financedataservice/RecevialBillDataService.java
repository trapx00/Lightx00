package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;

public interface RecevialBillDataService {
    ResultMessage submit(ReceivalBillPo bill);

    ResultMessage activate(ReceivalBillPo bill);

    ResultMessage abandon(ReceivalBillPo bill);

}
