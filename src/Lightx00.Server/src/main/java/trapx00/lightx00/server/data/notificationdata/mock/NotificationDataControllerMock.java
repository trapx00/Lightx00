package trapx00.lightx00.server.data.notificationdata.mock;

import trapx00.lightx00.server.data.notificationdata.NotificationDataController;
import trapx00.lightx00.shared.dataservicestub.notificationdataservice.NotificationDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.BillApprovalNotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.OtherNotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.util.Date;

public class NotificationDataControllerMock extends NotificationDataController {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public NotificationDataControllerMock() throws RemoteException {
    }


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
