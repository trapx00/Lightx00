package trapx00.lightx00.client.bl.notificationbl;

import trapx00.lightx00.client.bl.loginbl.CurrentUserService;
import trapx00.lightx00.client.bl.loginbl.factory.CurrentUserServiceFactory;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.client.datafactory.notificationdataservicefactory.NotificationDataServiceFactory;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.notification.NotificationConvertRegistry;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationBlController implements NotificationBlService, NotificationService {
    private NotificationDataService dataService = NotificationDataServiceFactory.getService();
    private CurrentUserService currentUserService = CurrentUserServiceFactory.getCurrentUserService();
    /**
     * Adds a notification.
     *
     * @param notification notification to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage addNotification(NotificationVo notification) {
        try {
            return dataService.add(NotificationConvertRegistry.convertToPo(notification));
        } catch (RemoteException e) {
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Updates current user's notifications
     *
     * @return current users's notifications
     */
    @Override
    public NotificationVo[] update() {
        EmployeeVo currentUser = currentUserService.getCurrentUser();
        try {
            NotificationPo[] queryResult = dataService.query(new NotificationQueryVo().eq("receiverId", currentUser.getId()));
            List<NotificationVo> voList = Arrays.stream(queryResult)
                .map(NotificationConvertRegistry::convertToVo)
                .collect(Collectors.toList());
            return voList.toArray(new NotificationVo[voList.size()]);
        } catch (RemoteException e) {
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Acknowledges a notification. For a BillApprovalNotification with a bill that is approved of, it also activates the bill.
     *
     * @param notification notification
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationVo notification) {
        NotificationOperationRegistry.activate(notification);
        try {
            return dataService.acknowledge(notification.getId());
        } catch (RemoteException e) {
            throw new UncheckedRemoteException(e);
        }
    }

    /**
     * Abandons a notification.
     *
     * @param notification notification with a bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(NotificationVo notification) {
        NotificationOperationRegistry.abandon(notification);
        try {
            return dataService.acknowledge(notification.getId());
        } catch (RemoteException e) {
            throw new UncheckedRemoteException(e);
        }
    }

}
