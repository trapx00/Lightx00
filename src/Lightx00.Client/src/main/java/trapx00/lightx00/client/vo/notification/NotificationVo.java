package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.notification.NotificationType;


import java.util.Date;

public class NotificationVo {
    private String id;
    private Date date;
    private EmployeeVo sender;
    private EmployeeVo receiver;
    private NotificationType type;

    public NotificationVo(String id, Date date, EmployeeVo sender, EmployeeVo receiver, NotificationType type) {
        this.id = id;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
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

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
