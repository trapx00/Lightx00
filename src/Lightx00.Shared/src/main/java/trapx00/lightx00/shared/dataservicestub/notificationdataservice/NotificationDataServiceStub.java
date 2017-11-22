package trapx00.lightx00.shared.dataservicestub.notificationdataservice;

import java.util.Date;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

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
                new NotificationPo("123",new Date(), "","", NotificationType.BillApproval,"FXD-20171122-00001"),
                new NotificationPo("123", new Date(), "","",NotificationType.Others,"hahaha")
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
