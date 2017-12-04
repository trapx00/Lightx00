package trapx00.lightx00.client.vo.notification.billapproval;

import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationConvertRegistry;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.client.vo.BillVo;

import java.util.Date;

public class BillApprovalNotificationVo extends NotificationVo {

    private BillVo bill;

    public BillApprovalNotificationVo(int id, Date date, EmployeeVo sender, EmployeeVo[] receivers, BillVo bill) {
        super(id, date, sender, receivers, NotificationType.BillApproval);
        this.bill = bill;
    }

    public BillApprovalNotificationVo(Date date, EmployeeVo sender, EmployeeVo[] receivers,  BillVo bill) {
        super(date, sender, receivers, NotificationType.BillApproval);
        this.bill = bill;
    }

    public NotificationAbandonService notificationAbandonService() {
        return bill.notificationAbandonService();
    }

    public NotificationActivateService notificationActivateService() {
        return bill.notificationActivateService();
    }

    public BillVo getBill() {
        return bill;
    }

    public void setBill(BillVo bill) {
        this.bill = bill;
    }
}
