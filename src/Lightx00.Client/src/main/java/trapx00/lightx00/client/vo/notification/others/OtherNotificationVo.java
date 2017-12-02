package trapx00.lightx00.client.vo.notification.others;

import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationConvertRegistry;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.Date;

public class OtherNotificationVo extends NotificationVo {
    private String content;

    public OtherNotificationVo(int id, Date date, EmployeeVo sender, EmployeeVo receiver, String content) {
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
