package trapx00.lightx00.shared.po.bill;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

public class BillPo {
    @DatabaseField
    private BillType billType;
    @DatabaseField(id = true)
    private String id;
    @DatabaseField
    private Date date;
    @DatabaseField
    private BillState state;

    public BillPo(BillType billType, String id, Date date, BillState state) {
        this.billType = billType;
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public BillPo() {

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

