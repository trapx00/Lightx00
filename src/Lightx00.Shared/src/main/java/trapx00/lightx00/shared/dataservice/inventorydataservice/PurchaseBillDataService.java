package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

public interface  PurchaseBillDataService {

    ResultMessage submit(PurchaseBillPo purchaseBill);//提交进货单
}