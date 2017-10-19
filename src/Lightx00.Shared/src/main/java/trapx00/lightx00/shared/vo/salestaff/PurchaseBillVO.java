package trapx00.lightx00.shared.vo.salestaff;

import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;

public class PurchaseBillVO extends PurchaseBillBaseVO {
    String supplier;
    int repository;
    SaleStaffVO operator;
    String Comment;
    double total;
    CommodityVO[] commodityList;
}
