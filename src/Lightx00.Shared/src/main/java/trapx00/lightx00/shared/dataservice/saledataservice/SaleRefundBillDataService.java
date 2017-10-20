package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPO;

interface SaleRefundBillDataService{
    public ResultMessage submit(SaleRefundBillPO saleRefundBill);//提交销售退货单
}