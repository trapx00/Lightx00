package trapx00.lightx00.shared.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class BillApprovalNotificationVo extends NotificationVo {
    BillVo bill;

    public BillApprovalNotificationVo(String id, Date date, EmployeeVo sender, EmployeeVo receiver, BillVo bill) {
        super(id, date, sender, receiver, NotificationType.BillApproval);
        this.bill = bill;
    }

    public BillVo getBill() {
        return bill;
    }

    public void setBill(BillVo bill) {
        this.bill = bill;
    }
}
