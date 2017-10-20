package trapx00.lightx00.client.blservice.saleblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillVO;

interface SaleRefundBillBLService {
    public ResultMessage[] submit(SaleRefundBillVO saleRefundBill);//提交销售退货单

    public ResultMessage saveAsDraft(SaleRefundBillVO saleRefundBill);//保存销售退货单为草稿
}