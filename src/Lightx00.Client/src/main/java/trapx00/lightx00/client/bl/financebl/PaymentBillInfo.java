package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.shared.vo.financestaff.PaymentBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

public interface PaymentBillInfo {
    /**
     * Queries PaymentBill.
     * @param query query
     * @return PaymentBillVos that match the condition
     */
    PaymentBillVo[] query(PaymentBillQueryVo query);
}