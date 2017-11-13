package trapx00.lightx00.shared.dataservicestub.notificationdataservice;

import java.rmi.RemoteException;
import java.util.Date;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.BillApprovalNotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.OtherNotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import javax.management.NotificationBroadcaster;

public class NotificationDataServiceStub implements NotificationDataService {


    /**
     * Updates current user's notification.
     *
     * @param query
     * @return current user's notification
     */
    @Override
    public NotificationPo[] update(NotificationQueryVo query) {
        return new NotificationPo[] {
                new OtherNotificationPo("123",new Date(), "","","123"),
                new BillApprovalNotificationPo("123", new Date(), "","","")
        };
    }

    /**
     * Acknowledges a notification.
     *
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return ResultMessage.Success;
    }
}
