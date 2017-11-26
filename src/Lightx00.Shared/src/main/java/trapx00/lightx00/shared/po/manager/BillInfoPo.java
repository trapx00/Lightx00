package trapx00.lightx00.shared.po.manager;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

@DatabaseTable(tableName = "BillInfo")
public class BillInfoPo {
    @DatabaseField(id = true)
    String id;
    @DatabaseField
    BillType type;
    @DatabaseField
    Date approvalTime;
    @DatabaseField
    BillState state;

    public BillInfoPo(String id,BillType type,Date approvalTime,BillState state) {
        this.id = id;
        this.type = type;
        this.approvalTime = approvalTime;
        this.state = state;
    }

    public BillInfoPo() {}

    public String getId() {
        return id;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public BillType getType() {
        return type;
    }

    public BillState getState() {
        return state;
    }
}
