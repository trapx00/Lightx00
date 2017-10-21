package trapx00.lightx00.shared.po.salestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class SaleBillPo extends SaleBillBasePo {
    String supplier;
    String defaultOperatorId;
    String operatorId;
    int repository;
    CommodityPo[] commodityList;
    double originTotal;
    double minusProfits;
    double token;
    double ultiTotal;
    String comment;

    public SaleBillPo(String Id, Date date, BillState state, String supplier, String defaultOperatorId, String operatorId, int repository, CommodityPo[] commodityList, double originTotal, double minusProfits, double token, double ultiTotal, String comment) {
        super(Id, date, state, SaleBillType.Sale);
        this.supplier = supplier;
        this.defaultOperatorId = defaultOperatorId;
        this.operatorId = operatorId;
        this.repository = repository;
        this.commodityList = commodityList;
        this.originTotal = originTotal;
        this.minusProfits = minusProfits;
        this.token = token;
        this.ultiTotal = ultiTotal;
        this.comment = comment;
    }
}
