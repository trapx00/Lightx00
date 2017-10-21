package trapx00.lightx00.shared.dataservice.notificationdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.vo.notification.NotificationVo;

public interface NotificationDataService {

    NotificationVo[] update();

    ResultMessage acknowledge(NotificationPo notification);
}
