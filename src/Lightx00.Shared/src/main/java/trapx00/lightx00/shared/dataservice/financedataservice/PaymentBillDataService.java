package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;

public interface PaymentBillDataService {
    ResultMessage submit(PaymentBillPo bill);

    ResultMessage activate(PaymentBillPo bill);

    ResultMessage abandon(PaymentBillPo bill);
}
