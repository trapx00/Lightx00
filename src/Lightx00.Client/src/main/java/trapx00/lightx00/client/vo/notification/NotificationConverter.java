package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public interface NotificationConverter {
    /**
     * Converts NotificationPo to NotificationVo.
     * @param notificationPo NotificationPo
     * @return NotificationVo
     */
    NotificationVo convert(NotificationPo notificationPo);
}
