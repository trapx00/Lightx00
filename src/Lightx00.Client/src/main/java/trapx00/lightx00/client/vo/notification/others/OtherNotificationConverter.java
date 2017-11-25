package trapx00.lightx00.client.vo.notification.others;

import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.client.vo.notification.NotificationConverter;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public class OtherNotificationConverter implements NotificationConverter {
    /**
     * Converts NotificationPo to NotificationVo.
     *
     * @param notificationPo NotificationPo
     * @return NotificationVo
     */
    @Override
    public NotificationVo convert(NotificationPo notificationPo) {
        return new OtherNotificationVo(notificationPo.getId(), notificationPo.getDate(), null,null,notificationPo.getContent());
    }
}
