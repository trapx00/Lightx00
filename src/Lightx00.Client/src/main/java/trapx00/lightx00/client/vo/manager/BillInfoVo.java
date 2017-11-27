package trapx00.lightx00.client.vo.manager;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillInfoVo {
    String id;
    BillType type;
    Date approvalTime;
    BillState state;

    public BillInfoVo(String id,BillType type,Date approvalTime,BillState state) {
        this.id = id;
        this.type = type;
        this.approvalTime = approvalTime;
        this.state = state;
    }

    public BillInfoVo() {}

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
