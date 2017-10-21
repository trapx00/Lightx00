package trapx00.lightx00.shared.po;

import java.util.Date;

public class DraftPo {
    Date saveTime;
    String billId;

    public DraftPo(Date saveTime, String billId) {
        this.saveTime = saveTime;
        this.billId = billId;
    }
}
