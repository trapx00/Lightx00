package trapx00.lightx00.client.bl.salebl;

import trapx00.lightx00.shared.vo.salestaff.SaleBillQueryVo;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillQueryVo;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillVo;

public interface SaleBillBlInfo {

    /**
     * query for SaleBills
     * @param query function
     * @return array of SaleBillVo
     */
    SaleBillVo[] querySaleBill(SaleBillQueryVo query);

    /**
     * query for SaleRefundBills
     * @param query function
     * @return array of SaleRefundBillVo
     */
    SaleRefundBillVo[] querySaleRefundBill(SaleRefundBillQueryVo query);
}
