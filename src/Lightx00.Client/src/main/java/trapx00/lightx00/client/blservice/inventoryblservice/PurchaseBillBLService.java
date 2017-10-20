package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillVO;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVO;

interface PurchaseBillBLService {
    public ResultMessage submit(PurchaseBillVO purchaseBill);//提交进货单

    public ResultMessage saveAsDraft(PurchaseRefundBillVO purchaseRefundBill);//保存进货单为草稿
}