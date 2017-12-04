package trapx00.lightx00.shared.po.inventorystaff;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;


@DatabaseTable(tableName = "InventoryGiftBill")
public class InventoryGiftPo extends InventoryBillPo {
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private  PromotionCommodity[] gifts;
    @DatabaseField
    private String operatorId;

    public InventoryGiftPo(BillType billType, String id, Date date, BillState state, InventoryBillType inventoryBillType
            , PromotionCommodity[] gifts) {
        super(id,date,state,inventoryBillType);
        this.gifts = gifts;
    }
    @Override
    public String getOperatorId() {
        return operatorId;
    }

    @Override
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public InventoryGiftPo(){ ; }
    public PromotionCommodity[] getGifts() {
        return gifts;
    }


    public void setGifts(PromotionCommodity[] gifts) {
        this.gifts = gifts;
    }
}
