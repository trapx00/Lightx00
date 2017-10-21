package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public interface PaymentBillBlService {
    ResultMessage submit(PaymentBillVo bill);
    ResultMessage saveAsDraft(PaymentBillVo bill);
    PaymentBillVo resume();
}
