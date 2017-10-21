package trapx00.lightx00.shared.dataservice.notificationdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPO;
import trapx00.lightx00.shared.vo.notification.NotificationVO;

public interface NotificationBLService {
    NotificationVO[] update();
    ResultMessage acknowledge(NotificationPO notification);
}
