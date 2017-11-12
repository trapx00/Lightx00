package trapx00.lightx00.client.vo;

import java.util.Date;

public class DraftVo {
    private Date saveTime;
    private String id;
    private EmployeeVo saver;
    private Draftable draft;

    public DraftVo(Date saveTime, String id, EmployeeVo saver, Draftable draft) {
        this.saveTime = saveTime;
        this.id = id;
        this.saver = saver;
        this.draft = draft;
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

    public EmployeeVo getSaver() {
        return saver;
    }

    public void setSaver(EmployeeVo saver) {
        this.saver = saver;
    }

    public Draftable getDraft() {
        return draft;
    }

    public void setDraft(Draftable draft) {
        this.draft = draft;
    }

}
