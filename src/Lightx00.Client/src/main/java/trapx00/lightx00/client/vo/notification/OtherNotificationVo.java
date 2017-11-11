package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.Date;

public class OtherNotificationVo extends NotificationVo {
    private String content;

    public OtherNotificationVo(String id, Date date, EmployeeVo sender, EmployeeVo receiver, String content) {
        super(id, date, sender, receiver, NotificationType.Others);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
