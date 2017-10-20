package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPO;

public interface RecevialBillDataService {
    ResultMessage submit(ReceivalBillPO bSill);
    ResultMessage activate(ReceivalBillPO bill);
    ResultMessage abandon(ReceivalBillPO bill);

}
