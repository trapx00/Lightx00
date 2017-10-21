package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class PurchaseBillPo extends PurchaseBillBasePo {
    String supplier;
    int repository;
    String operatorId;
    String comment;
    double total;
    CommodityPo[] commodityList;


    public PurchaseBillPo(String Id, Date date, BillState state, String supplier, int repository, String operatorId, String comment, double total, CommodityPo[] commodityList) {
        super(Id, date, state, PurchaseBillType.Purchase);
        this.supplier = supplier;
        this.repository = repository;
        this.operatorId = operatorId;
        this.comment = comment;
        this.total = total;
        this.commodityList = commodityList;
    }
}
