package trapx00.lightx00.client.vo.manager;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.manager.BillInfoPo;

import java.util.Date;

public class BillInfoVo {
    private String id;
    private BillType type;
    private Date approvalTime;
    private BillState state;

    public BillInfoVo(String id,BillType type,Date approvalTime,BillState state) {
        this.id = id;
        this.type = type;
        this.approvalTime = approvalTime;
        this.state = state;
    }

    public BillInfoPo toPo () {
        return new BillInfoPo(id,type,approvalTime,state);
    }

    public static BillInfoVo fromPo(BillInfoPo billInfo) {
        return new BillInfoVo(billInfo.getId(),billInfo.getType(), billInfo.getApprovalTime(),billInfo.getState());
    }

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
