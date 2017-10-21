package trapx00.lightx00.shared.dataservice.notificationdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;

public interface NotificationDataService {

    NotificationPo[] update();

    ResultMessage acknowledge(NotificationPo notification);
}
