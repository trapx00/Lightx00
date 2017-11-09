package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

public interface SaleRefundBillDataService {

    /**
     * submit a saleRefundBill
     * @param saleRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(SaleRefundBillPo saleRefundBill);//提交销售退货单
}