package trapx00.lightx00.client.vo.manager;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

public class BillQueryVo { //得到待审批单据
    String id;
    BillType type;
    Date date;
    BillState state;

    public BillQueryVo(String id, BillType type, Date date, BillState state) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.state = state;
    }

    public void setType(BillType type) {
        this.type = type;
    }

    public void setState(BillState state) {
        this.state = state;
    }

    public void setId(String id) {
        id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public BillState getState() {
        return state;
    }

    public BillType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
