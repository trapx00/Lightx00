package trapx00.lightx00.shared.po.notification;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "BillApprovalNotification")
public class BillApprovalNotificationPo extends NotificationPo {
    @DatabaseField
    private String billId;

    public BillApprovalNotificationPo(String id, Date date, String senderId, String receiverId, String billId) {
        super(id, date, senderId, receiverId, NotificationType.BillApproval);
        this.billId = billId;
    }

    public BillApprovalNotificationPo() {
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
