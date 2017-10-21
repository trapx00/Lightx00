package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class BillApprovalNotificationPo extends NotificationPo {
    String billId;

    public BillApprovalNotificationPo(String id, Date date,  String billId) {
        super(id, date, NotificationType.BillApproval);
        this.billId = billId;
    }
}
