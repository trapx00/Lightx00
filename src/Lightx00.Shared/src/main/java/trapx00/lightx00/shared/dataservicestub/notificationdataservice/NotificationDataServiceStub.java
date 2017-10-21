package trapx00.lightx00.shared.dataservicestub.notificationdataservice;

import java.util.Date;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.BillApprovalNotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.OtherNotificationPo;

public class NotificationDataServiceStub implements NotificationDataService {

    @Override
    public NotificationPo[] update() {
        return new NotificationPo[] {
                new OtherNotificationPo("123",new Date(), "","","123"),
                new BillApprovalNotificationPo("123", new Date(), "","","")
        };
    }

    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return ResultMessage.Success;
    }
}
