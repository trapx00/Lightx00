package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;

public class SaleRefundBillPO extends SaleBillBasePO {
    String supplier;
    String defaultOperatorId;
    String operatorId;
    int repository;
    CommodityPO[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String Comment;
}
