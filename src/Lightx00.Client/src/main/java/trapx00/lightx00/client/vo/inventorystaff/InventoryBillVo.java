package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.client.vo.BillVo;

public class InventoryBillVo extends BillVo {
    //报损报溢报警
    String operatorId;
    CommodityVo[] commodities;//商品
    double[] amountList;//报损报警报溢数量
    InventoryBillType type;
    Date time;

    public InventoryBillVo(String id, Date date, BillState state, String operatorId,
                           CommodityVo[] commodities, double[] amountList, InventoryBillType type,
                           Date time) {
        super(BillType.InventoryBill, id, date, state);
        this.operatorId = operatorId;
        this.commodities = commodities;
        this.amountList = amountList;
        this.type = type;
        this.time = time;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public CommodityVo[] getCommodities() {
        return commodities;
    }

    public void setCommodities(CommodityVo[] commodities) {
        this.commodities = commodities;
    }

    public double[] getAmountList() {
        return amountList;
    }

    public void setAmountList(double[] amountList) {
        this.amountList = amountList;
    }

    public InventoryBillType getType() {
        return type;
    }

    public void setType(InventoryBillType type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
