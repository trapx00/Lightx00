package trapx00.lightx00.server.data.logdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;

public class LogDataDaoFactory extends BaseDatabaseFactory {

    static {
        initTable(LogPo.class);
    }

    private static Dao<LogPo, Integer> logDao;

    public static Dao<LogPo, Integer> getLogDao() {
        if (logDao==null) {
            try {
                logDao = DaoManager.createDao(connectionSource,LogPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return logDao;
    }
}