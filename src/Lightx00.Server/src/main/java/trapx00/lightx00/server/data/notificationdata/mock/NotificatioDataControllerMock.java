package trapx00.lightx00.server.data.notificationdata.mock;

import trapx00.lightx00.server.data.notificationdata.NotificationDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import java.rmi.RemoteException;

public class NotificatioDataControllerMock extends NotificationDataController {

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
    protected NotificatioDataControllerMock() throws RemoteException {
        super();
    }

    /**
     * Updates current user's notification.
     *
     * @param query
     * @return current user's notification
     */
    @Override
    public NotificationPo[] update(NotificationQueryVo query) throws RemoteException {
        return super.update(query);
    }

    /**
     * Acknowledges a notification.
     *
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return super.acknowledge(notification);
    }
}
