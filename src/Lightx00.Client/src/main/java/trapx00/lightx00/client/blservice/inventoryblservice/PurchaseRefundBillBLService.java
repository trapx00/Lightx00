package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVO;

interface PurchaseRefundBillBLService {
    public ResultMessage submit(PurchaseRefundBillVO purchaseRefundBill);//提交进货退货单

    public ResultMessage saveAsDraft(PurchaseRefundBillVO purchaseRefundBill);//保存进货退货单为草稿
}