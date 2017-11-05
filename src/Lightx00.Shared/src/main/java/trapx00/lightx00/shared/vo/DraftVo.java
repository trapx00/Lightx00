package trapx00.lightx00.shared.vo;

import java.util.Date;

public class DraftVo {
    private Date saveTime;
    private String id;
    private String saverId;
    private Draftable draft;
    private String billTypePoClassName;

    public DraftVo(Date saveTime, String id, String saverId, Draftable draft, String billTypePoClassName) {
        this.saveTime = saveTime;
        this.id = id;
        this.saverId = saverId;
        this.draft = draft;
        this.billTypePoClassName = billTypePoClassName;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaverId() {
        return saverId;
    }

    public void setSaverId(String saverId) {
        this.saverId = saverId;
    }

    public Draftable getDraft() {
        return draft;
    }

    public void setDraft(Draftable draft) {
        this.draft = draft;
    }

    public String getBillTypePoClassName() {
        return billTypePoClassName;
    }

    public void setBillTypePoClassName(String billTypePoClassName) {
        this.billTypePoClassName = billTypePoClassName;
    }
}
