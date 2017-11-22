package trapx00.lightx00.server.data.notificationdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.notification.NotificationPo;

import java.sql.SQLException;

public class NotificationDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(NotificationPo.class);
    }

    private static Dao<NotificationPo, String> dao;

    public static Dao<NotificationPo, String> getDao() {
        try {
            dao = DaoManager.createDao(connectionSource, NotificationPo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }
}
