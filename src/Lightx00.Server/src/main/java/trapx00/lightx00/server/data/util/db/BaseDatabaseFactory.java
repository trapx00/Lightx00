package trapx00.lightx00.server.data.util.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import trapx00.lightx00.server.Server;
import trapx00.lightx00.shared.po.log.LogPo;

import java.sql.SQLException;

public class BaseDatabaseFactory {

    private static final String connectionString = "jdbc:sqlite:"+ getDbFilePath();
    protected static ConnectionSource connectionSource;

    private static String getDbFilePath() {
        return Server.class.getResource("/database/database.db").getPath();

    }

    protected BaseDatabaseFactory() {

    }

    public static void init() throws SQLException {
        BaseDatabaseFactory.connectionSource = new JdbcConnectionSource(connectionString);
    }

    protected static void initTable(Class<?> poClass) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, poClass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
