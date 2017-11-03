package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVo;

public interface PurchaseRefundBillBlService {

    ResultMessage submit(PurchaseRefundBillVo purchaseRefundBill);//提交进货退货单

    ResultMessage saveAsDraft(PurchaseRefundBillVo purchaseRefundBill);//保存进货退货单为草稿

    String getId();//获得新的ID
}