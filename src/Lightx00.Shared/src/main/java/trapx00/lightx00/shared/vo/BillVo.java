package trapx00.lightx00.shared.vo;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;
import java.util.HashMap;

public class BillVo implements Draftable {
    private BillType billType;
    private String id;
    private Date date;
    private BillState state;

    public BillVo(BillType billType, String id, Date date, BillState state) {
        this.billType = billType;
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public BillType getBill() {
        return billType;
    }

    public void setBill(BillType bill) {
        this.billType = bill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BillState getState() {
        return state;
    }

    public void setState(BillState state) {
        this.state = state;
    }

    public void revert() {

    }

    @Override
    public HashMap<String, String> getPairValues() {
        return null;
    }
}
