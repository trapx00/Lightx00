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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }
}
