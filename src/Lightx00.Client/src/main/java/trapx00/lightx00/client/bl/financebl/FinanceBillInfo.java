package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.shared.vo.financestaff.FinanceBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.FinanceBillVo;

public interface FinanceBillInfo {
    /**
     * Queries FinanceBill
     * @param query FinanceBill query condition
     * @return Finance bills that match query condition
     */
    FinanceBillVo query(FinanceBillQueryVo query);
}
