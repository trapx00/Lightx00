package trapx00.lightx00.shared.vo.inventorystaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class InventoryBillVo extends BillVo {//报损报溢报警
    String operatorId;
    CommodityVo[] commodities;//商品
    double[] amountList;//报损报警报溢数量
    InventoryBillType type;
    Date time;

    public InventoryBillVo(String Id, Date date, BillState state, String operatorId, CommodityVo[] commodities, double[] amountList, InventoryBillType type, Date time) {
        super(BillType.InventoryBill, Id, date, state);
        this.operatorId = operatorId;
        this.commodities = commodities;
        this.amountList = amountList;
        this.type = type;
        this.time = time;
    }
}
