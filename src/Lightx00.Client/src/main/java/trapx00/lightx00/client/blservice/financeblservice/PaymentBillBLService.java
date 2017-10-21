package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVO;

public interface PaymentBillBLService {
    ResultMessage submit(PaymentBillVO bill);
    ResultMessage saveAsDraft(PaymentBillVO bill);
    PaymentBillVO resume();
}
