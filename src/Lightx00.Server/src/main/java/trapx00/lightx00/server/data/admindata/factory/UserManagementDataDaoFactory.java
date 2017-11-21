package trapx00.lightx00.server.data.admindata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.sql.SQLException;

public class UserManagementDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<EmployeePo,String> userAccountDao;

    /**
     * Create a userAccountDao.
     * @return userAccountDao
     */
    public static Dao<EmployeePo,String> getUserAccountDao() {
        if (userAccountDao == null) {
            try {
                userAccountDao = DaoManager.createDao(connectionSource,EmployeePo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userAccountDao;
    }
}
