package trapx00.lightx00.shared.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.shared.vo.BillVo;

import java.util.Date;

public class BillApprovalNotificationVo extends NotificationVo {
    BillVo bill;

    public BillApprovalNotificationVo(String Id, Date date, NotificationType type, BillVo bill) {
        super(Id, date, type);
        this.bill = bill;
    }
}
