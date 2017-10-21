package trapx00.lightx00.shared.po.inventorystaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class InventoryDetailBillPo extends InventoryBillPo{//报损报溢报警
    String operatorId;//操作员编号
    String[] commodityIdList;//商品
    double[] amounts;//报损/报溢/报警数量
    Date time;

    public InventoryDetailBillPo(String Id, Date date, BillState state, InventoryBillType inventoryBillType, String operatorId, String[] commodityIdList, double[] amounts, Date time) {
        super(Id, date, state, inventoryBillType);
        this.operatorId = operatorId;
        this.commodityIdList = commodityIdList;
        this.amounts = amounts;
        this.time = time;
    }
}
