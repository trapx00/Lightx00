package trapx00.lightx00.client.vo.notification.others;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationConverterRegistry;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.client.vo.notification.others.OtherNotificationConverter;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.Date;

public class OtherNotificationVo extends NotificationVo {
    static {
        NotificationConverterRegistry.register(NotificationType.Others, new OtherNotificationConverter());
    }
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
