package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

interface SaleRefundBillDataService{
    public ResultMessage submit(SaleRefundBillPo saleRefundBill);//提交销售退货单
}