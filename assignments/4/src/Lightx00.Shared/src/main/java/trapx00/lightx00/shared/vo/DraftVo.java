package trapx00.lightx00.shared.vo;

import java.util.Date;

public class DraftVo {
    private Date saveTime;
    private BillVo bill;

    public DraftVo(Date saveTime, BillVo bill) {
        this.saveTime = saveTime;
        this.bill = bill;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public BillVo getBill() {
        return bill;
    }

    public void setBill(BillVo bill) {
        this.bill = bill;
    }
}
