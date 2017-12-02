package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;

@DatabaseTable(tableName = "InventoryDetailBill")
public class InventoryDetailBillPo extends InventoryBillPo {
    @DatabaseField
    private String operatorId;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private InventoryWarningItem[] commodityList;//商品


    public InventoryDetailBillPo(){

    }

    public InventoryDetailBillPo(String id, Date date, BillState state,
                                 InventoryBillType inventoryBillType,
                                 InventoryWarningItem[] inventoryWarningItems,String operatorId) {
        super(id, date, state, inventoryBillType);
        this.commodityList = inventoryWarningItems;
        this.operatorId=operatorId;
    }


    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    public InventoryWarningItem[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(InventoryWarningItem[] commodityList) {
        this.commodityList = commodityList;
    }

    public void setNum(double num,CommodityPo commodityPo){
        commodityPo.setInventoryNum(num);
    }

    public double getNum(CommodityPo commodityPo){
        return commodityPo.getInventoryNum();
    }




}
