package trapx00.lightx00.server.data.logindata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.sql.SQLException;

public class LoginDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(EmployeePo.class);
    }

    private static Dao<EmployeePo, String> dao;

    public static Dao<EmployeePo, String> getDao() {
        try {
            dao = DaoManager.createDao(connectionSource, EmployeePo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dao;
    }
}
