package trapx00.lightx00.client.vo.notification;

import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.HashMap;

public class NotificationConverterRegistry {
    private static HashMap<NotificationType, NotificationConverter> registry = new HashMap<>();

    /**
     * Registers a NotificationType-Converter pair into registry.
     * @param notificationType NotificationType
     * @param converter Converter for this NotificationType
     */
    public static void register(NotificationType notificationType, NotificationConverter converter) {
        registry.put(notificationType, converter);
    }

    /**
     * Converts NotificationPo to NotificationVo according to the registry.
     * @param notificationPo NotificationPo
     * @return NotificationVo
     */
    public static NotificationVo convert(NotificationPo notificationPo) {
        return registry.get(notificationPo.getType()).convert(notificationPo);
    }
}
