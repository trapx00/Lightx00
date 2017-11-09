package trapx00.lightx00.shared.dataservice.notificationdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NotificationDataService extends Remote {

    /**
     * Updates current user's notification.
     * @return current user's notification
     */
    NotificationPo[] update(NotificationQueryVo query) throws RemoteException;

    /**
     * Acknowledges a notification.
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */

    ResultMessage acknowledge(NotificationPo notification) throws RemoteException;
}
