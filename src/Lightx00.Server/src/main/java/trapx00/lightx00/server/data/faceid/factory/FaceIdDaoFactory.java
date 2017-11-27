package trapx00.lightx00.server.data.faceid.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.employee.EmployeeFaceIdInfo;

import java.sql.SQLException;

public class FaceIdDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(EmployeeFaceIdInfo.class);
    }

    private static Dao<EmployeeFaceIdInfo, Integer> dao;

    /**
     * Gets dao.
     * @return dao
     */
    public static Dao<EmployeeFaceIdInfo, Integer> getDao() {
        if (dao == null) {
            try {
                dao = DaoManager.createDao(connectionSource,EmployeeFaceIdInfo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dao;
    }
}
