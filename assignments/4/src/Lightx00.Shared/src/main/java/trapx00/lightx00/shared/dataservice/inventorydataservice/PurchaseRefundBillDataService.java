package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

public interface  PurchaseRefundBillDataService {

    ResultMessage submit(PurchaseRefundBillPo purchaseBill);//提交进货退货单

}