package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.client.vo.BillVo;

import java.util.Date;

public class BillApprovalNotificationVo extends NotificationVo {
    private BillVo bill;

    public BillApprovalNotificationVo(String id, Date date, String senderId, String receiverId, BillVo bill) {
        super(id, date, senderId, receiverId, NotificationType.BillApproval);
        this.bill = bill;
    }

    public BillVo getBill() {
        return bill;
    }

    public void setBill(BillVo bill) {
        this.bill = bill;
    }
}
