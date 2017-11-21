package trapx00.lightx00.shared.po.notification;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


public class NotificationPo {
    @DatabaseField(id=true)
    private String id;
    @DatabaseField
    private Date date;
    @DatabaseField
    private String senderId;
    @DatabaseField
    private String receiverId;
    @DatabaseField
    private NotificationType type;

    public NotificationPo(String id, Date date, String senderId, String receiverId, NotificationType type) {
        this.id = id;
        this.date = date;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.type = type;
    }

    public NotificationPo() {
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
