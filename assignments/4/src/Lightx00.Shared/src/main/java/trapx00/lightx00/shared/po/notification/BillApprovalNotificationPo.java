package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class BillApprovalNotificationPo extends NotificationPo {
    private String billId;

    public BillApprovalNotificationPo(String id, Date date, String senderId, String receiverId, String billId) {
        super(id, date, senderId, receiverId, NotificationType.BillApproval);
        this.billId = billId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
