package trapx00.lightx00.shared.po.notification;

import java.util.Date;

public class NotificationPo {
    String id;
    Date date;
    String senderId;
    String receiverId;
    NotificationType type;

    public NotificationPo(String id, Date date, String senderId, String receiverId, NotificationType type) {
        this.id = id;
        this.date = date;
        this.senderId = senderId;
        this.receiverId = receiverId;
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

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }
}
