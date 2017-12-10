package trapx00.lightx00.server.data.util.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.TableUtils;
import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;
import trapx00.lightx00.server.Server;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;

import java.sql.SQLException;
import java.util.Date;

import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;

public class BaseDatabaseFactory {

    private static final String connectionString = "jdbc:sqlite:" + getDbFilePath();
    protected static ConnectionSource connectionSource;

    private static String getDbFilePath() {
        return Server.class.getResource("/database/database.db").getPath();

    }

    protected static <Po, PK> Dao<Po, PK> createDao(Class<Po> clazz) {
        try {
            return DaoManager.createDao(connectionSource, clazz);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected BaseDatabaseFactory() {
    }

    public static void init() throws SQLException {
        System.setProperty("com.j256.ormlite.logger.level", "ERROR"); //this closes ORMLite log
        BaseDatabaseFactory.connectionSource = new JdbcConnectionSource(connectionString);
        initializeTables();
    }

    private static void initializeTables() {
        FastClasspathScanner scanner = new FastClasspathScanner();

        scanner.matchClassesWithAnnotation(DatabaseTable.class, classWithAnnotation -> {
            try {
                ServerLogServiceFactory.getService().printLog("BaseDatabaseFactory","initialized a table with Po class " + classWithAnnotation.getName());
                TableUtils.createTableIfNotExists(connectionSource, classWithAnnotation);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }).scan();

        initializeData();
    }

    private static void initializeData() {

        try {
            Dao<BankAccountPo, Integer> dao = createDao(BankAccountPo.class);
            TableUtils.dropTable(dao,true);
            TableUtils.createTableIfNotExists(connectionSource, BankAccountPo.class);
            dao.create(new BankAccountPo("1", 10, new Date()));
            dao.create(new BankAccountPo("2", 20, new Date()));

            Dao<FinanceStaffPo, String> financeStaffDao = createDao(FinanceStaffPo.class);
            TableUtils.dropTable(financeStaffDao, true);
            TableUtils.createTableIfNotExists(connectionSource, FinanceStaffPo.class);
            financeStaffDao.create(new FinanceStaffPo("财务人员","1", new Date(), "123","123"));
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
