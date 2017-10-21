package trapx00.lightx00.client.blservice.notificationblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.notification.NotificationVo;

public interface NotificationBlService {

    NotificationVo[] update();

    ResultMessage acknowledge(NotificationVo notification);

    ResultMessage activate(NotificationVo notification);

    ResultMessage abandon(NotificationVo notification);

    ResultMessage modify(NotificationVo notification);

}
