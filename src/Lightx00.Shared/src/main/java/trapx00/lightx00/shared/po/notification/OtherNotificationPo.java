package trapx00.lightx00.shared.po.notification;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "OtherNotification")
public class OtherNotificationPo extends NotificationPo {
    @DatabaseField
    private String content;

    public OtherNotificationPo(String id, Date date, String senderId, String receiverId, String content) {
        super(id, date, senderId, receiverId, NotificationType.Others);
        this.content = content;
    }

    public OtherNotificationPo() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
