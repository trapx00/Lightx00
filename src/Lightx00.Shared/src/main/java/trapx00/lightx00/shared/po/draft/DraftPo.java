package trapx00.lightx00.shared.po.draft;

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
    private String draftId;
    @DatabaseField
    private DraftType draftType;

    public DraftPo(Date saveTime, String saverId, String billId, DraftType draftType) {
        this.saveTime = saveTime;
        this.saverId = saverId;
        this.draftId = billId;
        this.draftType = draftType;
    }

    public DraftPo() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public DraftType getDraftType() {
        return draftType;
    }

    public void setDraftType(DraftType draftType) {
        this.draftType = draftType;
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

    public String getDraftId() {
        return draftId;
    }

    public void setDraftId(String draftId) {
        this.draftId = draftId;
    }
}
