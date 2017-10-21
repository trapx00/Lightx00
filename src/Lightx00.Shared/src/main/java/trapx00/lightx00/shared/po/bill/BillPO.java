package trapx00.lightx00.shared.po.bill;

import java.util.Date;

public class BillPo {
    BillType bill;
    String id;
    Date date;
    BillState state;

    public BillPo(BillType bill, String id, Date date, BillState state) {
        this.bill = bill;
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public BillType getBill() {
        return bill;
    }

    public void setBill(BillType bill) {
        this.bill = bill;
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

