package trapx00.lightx00.shared.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.Date;

public class NotificationVo {
    String id;
    Date date;
    NotificationType type;

    public NotificationVo(String id, Date date, NotificationType type) {
        this.id = id;
        this.date = date;
        this.type = type;
    }
}
