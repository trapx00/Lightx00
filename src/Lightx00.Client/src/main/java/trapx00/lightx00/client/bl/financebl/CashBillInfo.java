package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.shared.vo.financestaff.CashBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;

public interface CashBillInfo {
    /**
     * Queries CashBill.
     * @param query query
     * @return CashBillVos that match the condition
     */
    CashBillVo[] query(CashBillQueryVo query);

}
