package trapx00.lightx00.shared.vo;

import java.util.Date;

public class DraftVo {
    private Date saveTime;
    private Draftable draft;

    public DraftVo(Date saveTime, Draftable draft) {
        this.saveTime = saveTime;
        this.draft = draft;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public Draftable getDraft() {
        return draft;
    }

    public void setDraft(Draftable draft) {
        this.draft = draft;
    }
}
