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
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryStaffPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffType;

public class BaseDatabaseFactory {

    private static final String connectionString = "jdbc:sqlite:" + getDbFilePath();
    protected static ConnectionSource connectionSource;

    protected BaseDatabaseFactory() {
    }

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

    public static void init() throws SQLException {
        System.setProperty("com.j256.ormlite.logger.level", "ERROR"); //this closes ORMLite log
        BaseDatabaseFactory.connectionSource = new JdbcConnectionSource(connectionString);
        initializeTables();
    }

    private static void initializeTables() {
        FastClasspathScanner scanner = new FastClasspathScanner();

        scanner.matchClassesWithAnnotation(DatabaseTable.class, classWithAnnotation -> {
            try {
                ServerLogServiceFactory.getService().printLog("BaseDatabaseFactory", "initialized a table with Po class " + classWithAnnotation.getName());
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
            TableUtils.dropTable(dao, true);
            TableUtils.createTableIfNotExists(connectionSource, BankAccountPo.class);
            dao.create(new BankAccountPo("1", 10, new Date()));
            dao.create(new BankAccountPo("2", 20, new Date()));

            Dao<FinanceStaffPo, String> financeStaffDao = createDao(FinanceStaffPo.class);
            TableUtils.dropTable(financeStaffDao, true);
            TableUtils.createTableIfNotExists(connectionSource, FinanceStaffPo.class);
            financeStaffDao.create(new FinanceStaffPo("财务人员", "1", new Date(), "123", "123"));

            Dao<SaleStaffPo, String> saleStaffDao = createDao(SaleStaffPo.class);
            TableUtils.dropTable(saleStaffDao, true);
            TableUtils.createTableIfNotExists(connectionSource, SaleStaffPo.class);
            saleStaffDao.create(new SaleStaffPo("进货销售人员", "1", new Date(), "zlz", "zlz", SaleStaffType.President));


            Dao<InventoryStaffPo,String> inventoryStaffPos=createDao(InventoryStaffPo.class);
            TableUtils.dropTable(inventoryStaffPos, true);
            TableUtils.createTableIfNotExists(connectionSource, InventoryStaffPo.class);
            inventoryStaffPos.create(new InventoryStaffPo("库存管理人员", "1", new Date(), "12", "12"));

            Dao<CommodityPo,String>commodityPos=createDao(CommodityPo.class);
            TableUtils.dropTable(commodityPos, true);
            TableUtils.createTableIfNotExists(connectionSource, CommodityPo.class);
            commodityPos.create(new CommodityPo("PRO-0002-0001","SmallLed","PRO-0002",13,new Date(),"一",
                    "01",34,34,34,34,100));
            commodityPos.create(new CommodityPo("PRO-0002-0002","SmaqwellLed","PRO-0002",13,new Date(),"一",
                    "01",34,34,34,34,100));
            commodityPos.create(new CommodityPo("PRO-0003-0001","SmaqweasqllLed","PRO-0003",13,new Date(),"一",
                    "01",34,34,34,34,100));


            Dao<CommoditySortPo,String>commoditySortPos=createDao(CommoditySortPo.class);
            TableUtils.dropTable(commoditySortPos, true);
            TableUtils.createTableIfNotExists(connectionSource, CommoditySortPo.class);
            commoditySortPos.create( new CommoditySortPo("PRO-0001","Led",0,null,null));
            commoditySortPos.create(new CommoditySortPo("PRO-0002","DgLed",1,"PRO-0001",null));
            commoditySortPos.create(new CommoditySortPo("PRO-0003","qweLed",1,"PRO-0001",null));
            commoditySortPos.create(new CommoditySortPo("PRO-0004","qwasdeLed",0,"PRO-0001",null));
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
