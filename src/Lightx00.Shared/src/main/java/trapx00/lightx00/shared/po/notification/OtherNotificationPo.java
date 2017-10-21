package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class OtherNotificationPo extends NotificationPo {
    String content;

    public OtherNotificationPo(String id, Date date, String content) {
        super(id, date, NotificationType.Others);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
