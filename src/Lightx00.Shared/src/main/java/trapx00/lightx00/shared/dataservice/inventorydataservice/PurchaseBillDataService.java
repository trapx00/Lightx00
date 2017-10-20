package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPO;

interface  PurchaseBillDataService{
    public ResultMessage submit(PurchaseBillPO purchaseBill);//提交进货单
}