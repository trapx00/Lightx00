package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;

public class PurchaseRefundBillPO extends PurchaseBillBasePO {
    String supplier;
    int repository;
    String operatorId;
    String Comment;
    double total;
    CommodityPO[] commodityList;
}
