package trapx00.lightx00.shared.po;

import java.util.Date;

public class DraftPo {
    private String id;
    private Date saveTime;
    private String saverId;
    private String billId;
    private String billTypePoClassName;

    public DraftPo(String id, Date saveTime, String saverId, String billId) {
        this.id = id;
        this.saveTime = saveTime;
        this.saverId = saverId;
        this.billId = billId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public String getSaverId() {
        return saverId;
    }

    public void setSaverId(String saverId) {
        this.saverId = saverId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
