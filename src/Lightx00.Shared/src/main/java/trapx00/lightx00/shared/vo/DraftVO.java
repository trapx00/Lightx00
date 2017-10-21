package trapx00.lightx00.shared.vo;

import java.util.Date;

public class DraftVo {
    Date saveTime;
    BillVo bill;

    public DraftVo(Date saveTime, BillVo bill) {
        this.saveTime = saveTime;
        this.bill = bill;
    }
}
