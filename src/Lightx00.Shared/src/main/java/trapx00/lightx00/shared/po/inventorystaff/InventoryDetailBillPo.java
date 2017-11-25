package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;


@DatabaseTable(tableName = "InventoryDetailBill")
public class InventoryDetailBillPo extends InventoryBillPo {
    //报损报溢报警
    @DatabaseField
    private  String operatorId;//操作员编号
    @DatabaseField
    private String[] commodityIdList;//商品
    @DatabaseField
    private  double[] amounts;//报损/报溢/报警数量
    @DatabaseField
    private  Date time;

    public InventoryDetailBillPo(String id, Date date, BillState state,
                                 InventoryBillType inventoryBillType, String operatorId,
                                 String[] commodityIdList, double[] amounts, Date time) {
        super(id, date, state, inventoryBillType);
        this.operatorId = operatorId;
        this.commodityIdList = commodityIdList;
        this.amounts = amounts;
        this.time = time;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public String[] getCommodityIdList() {
        return commodityIdList;
    }

    public double[] getAmounts() {
        return amounts;
    }

    public Date getTime() {
        return time;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public void setCommodityIdList(String[] commodityIdList) {
        this.commodityIdList = commodityIdList;
    }

    public void setAmounts(double[] amounts) {
        this.amounts = amounts;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
