package trapx00.lightx00.client.blservice.notificationblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.notification.NotificationVO;

public interface NotificationBLService {
    NotificationVO[] update();
    ResultMessage acknowledge(NotificationVO notification);
    ResultMessage activate(NotificationVO notification);
    ResultMessage abandon(NotificationVO notification);
    ResultMessage modify(NotificationVO notification);
}
