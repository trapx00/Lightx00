package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVo;

public interface PurchaseBillBlService {

    ResultMessage submit(PurchaseBillVo purchaseBill);//提交进货单

    ResultMessage saveAsDraft(PurchaseBillVo purchaseBill);//保存进货单为草稿

    String getId();//获得新的ID
}