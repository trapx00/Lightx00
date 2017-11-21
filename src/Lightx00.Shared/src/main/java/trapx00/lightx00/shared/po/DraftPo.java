package trapx00.lightx00.shared.po;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Draft")
public class DraftPo {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private Date saveTime;
    @DatabaseField
    private String saverId;
    @DatabaseField
    private String billId;
    @DatabaseField
    private String billTypePoClassName;

    public DraftPo(Date saveTime, String saverId, String billId) {
        this.saveTime = saveTime;
        this.saverId = saverId;
        this.billId = billId;
    }

    public int getId() {
        return id;
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
