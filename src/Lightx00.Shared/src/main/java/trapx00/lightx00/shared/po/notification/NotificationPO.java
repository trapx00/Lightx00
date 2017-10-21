package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class NotificationPo {
    String id;
    Date date;
    NotificationType type;

    public NotificationPo(String id, Date date, NotificationType type) {
        this.id = id;
        this.date = date;
        this.type = type;
    }
}
