package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public interface NotificationConverter<VoType extends NotificationVo> {
    /**
     * Converts NotificationPo to NotificationVo.
     * @param notificationPo NotificationPo
     * @return NotificationVo
     */
    VoType convertToVo(NotificationPo notificationPo);

    /**
     * Convert
     * @param notificationVo
     * @return
     */
    NotificationPo convertToPo(VoType notificationVo);
}
