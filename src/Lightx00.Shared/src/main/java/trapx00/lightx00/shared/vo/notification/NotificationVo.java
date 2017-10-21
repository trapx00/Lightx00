package trapx00.lightx00.shared.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

public class NotificationVo {
    String id;
    Date date;
    EmployeeVo sender;
    EmployeeVo receiver;
    NotificationType type;

    public NotificationVo(String id, Date date, EmployeeVo sender, EmployeeVo receiver,
                          NotificationType type) {
        this.id = id;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
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

    public EmployeeVo getSender() {
        return sender;
    }

    public void setSender(EmployeeVo sender) {
        this.sender = sender;
    }

    public EmployeeVo getReceiver() {
        return receiver;
    }

    public void setReceiver(EmployeeVo receiver) {
        this.receiver = receiver;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }
}
