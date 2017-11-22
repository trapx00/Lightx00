package trapx00.lightx00.client.vo.notification.billapproval;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationConverterRegistry;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.client.vo.notification.billapproval.BillApprovalNotificationConverter;
import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.client.vo.BillVo;

import java.util.Date;

public class BillApprovalNotificationVo extends NotificationVo {

    static {
        NotificationConverterRegistry.register(NotificationType.BillApproval, new BillApprovalNotificationConverter());
    }

    private BillVo bill;

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
