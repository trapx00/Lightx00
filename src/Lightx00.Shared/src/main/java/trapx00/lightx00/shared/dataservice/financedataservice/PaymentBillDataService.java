package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPO;

public interface PaymentBillDataService {
    ResultMessage submit(PaymentBillPO bill);
    ResultMessage activate(PaymentBillPO bill);
    ResultMessage abandon(PaymentBillPO bill);
}
