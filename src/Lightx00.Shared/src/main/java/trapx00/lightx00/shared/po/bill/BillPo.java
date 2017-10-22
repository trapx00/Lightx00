package trapx00.lightx00.shared.po.bill;

import java.util.Date;

public class BillPo {
    private BillType billType;
    private String id;
    private Date date;
    private BillState state;

    public BillPo(BillType billType, String id, Date date, BillState state) {
        this.billType = billType;
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
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
}

