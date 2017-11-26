package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;

@DatabaseTable(tableName = "InventoryDetailBill")
public class InventoryDetailBillPo extends InventoryBillPo {
    @DatabaseField
    private  String operatorId;//操作员编号
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private CommodityPo[] commodityList;//商品


    public InventoryDetailBillPo(){

    }

    public InventoryDetailBillPo(String id, Date date, BillState state,
                                 InventoryBillType inventoryBillType, String operatorId,
                                 CommodityPo[] commodityIdList) {
        super(id, date, state, inventoryBillType);
        this.operatorId = operatorId;
        this.commodityList = commodityIdList;
    }


    public String getOperatorId() {
        return operatorId;
    }

    public CommodityPo[] getCommodityIdList() {
        return commodityList;
    }

    public void setNum(double num,CommodityPo commodityPo){
        commodityPo.setInventoryNum(num);
    }

    public double getNum(CommodityPo commodityPo){
        return commodityPo.getInventoryNum();
    }


    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public void setCommodityIdList(CommodityPo[] commodityIdList) {
        this.commodityList = commodityIdList;
    }

}
