package trapx00.lightx00.server.data.notificationdata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.notificationdata.factory.NotificationDataDaoFactory;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.queryvo.NotificationQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

public class NotificationDataController extends UnicastRemoteObject implements NotificationDataService {
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
    public NotificationDataController() throws RemoteException {
    }

    private Dao<NotificationPo, String> dao = NotificationDataDaoFactory.getDao();
    /**
     * Updates current user's notification.
     *
     * @param query
     * @return current user's notification
     */
    @Override
    public NotificationPo[] update(NotificationQueryVo query) throws RemoteException {
        try {
            List<NotificationPo> results = dao.query(query.prepareQuery(dao));
            return results.toArray(new NotificationPo[results.size()]);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Acknowledges a notification.
     *
     * @param notification notification to be acknowledged
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationPo notification) {
        return null;
    }
}
