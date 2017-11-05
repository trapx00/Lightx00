package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.shared.vo.financestaff.ReceivalBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

public interface ReceivalBillInfo {
    /**
     * Queries ReceivalBillVo.
     * @param query query
     * @return ReceivalBills that match the condition
     */
    ReceivalBillVo[] query(ReceivalBillQueryVo query);
}
