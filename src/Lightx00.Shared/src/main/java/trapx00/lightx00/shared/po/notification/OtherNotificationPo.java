package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class OtherNotificationPo extends NotificationPo {
    String content;

    public OtherNotificationPo(String id, Date date, String senderId, String receiverId, String content) {
        super(id, date, senderId, receiverId, NotificationType.Others);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
