package trapx00.lightx00.server.data.util.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.TableUtils;
import com.sun.tools.javac.util.Name;
import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;
import trapx00.lightx00.server.Server;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.admin.AdminPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.client.ClientState;
import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.shared.po.employee.EmployeeState;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryStaffPo;
import trapx00.lightx00.shared.po.manager.ManagerPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffType;
import trapx00.lightx00.shared.queryvo.promotion.TotalPricePromotionQueryVo;

import java.sql.SQLException;
import java.util.Date;

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
            throw new DbSqlException(e);
        }
    }

    private static void basicInit() throws SQLException {
        System.setProperty("com.j256.ormlite.logger.level", "ERROR"); //this closes ORMLite log
        BaseDatabaseFactory.connectionSource = new JdbcConnectionSource(connectionString);
    }

    public static void init() throws SQLException {
        basicInit();
        initializeData();
    }

    public static void initTest() throws SQLException {
        basicInit();
        dropAllTables();
    }

    public static void dropAllTables() {
        FastClasspathScanner scanner = new FastClasspathScanner();
        scanner.matchClassesWithAnnotation(DatabaseTable.class, classWithAnnotation -> {
            try {
                TableUtils.dropTable(connectionSource, classWithAnnotation, true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }).scan();
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
            financeStaffDao.create(new FinanceStaffPo("10002", "123456", new Date(), "123456",EmployeeState.Active,true));
            financeStaffDao.create(new FinanceStaffPo("10103", "财务职员", new Date(), "123456",EmployeeState.Active,false));

            Dao<SaleStaffPo, String> saleStaffDao = createDao(SaleStaffPo.class);
            TableUtils.dropTable(saleStaffDao, true);
            TableUtils.createTableIfNotExists(connectionSource, SaleStaffPo.class);
            saleStaffDao.create(new SaleStaffPo("10004", "销售主管", new Date(), "123456", SaleStaffType.AStaff,EmployeeState.Active,true));
            saleStaffDao.create(new SaleStaffPo("10201", "C销售主任", new Date(), "123456", SaleStaffType.AStaff,EmployeeState.Active,false));

            Dao<InventoryStaffPo,String> inventoryStaffPos=createDao(InventoryStaffPo.class);
            TableUtils.dropTable(inventoryStaffPos, true);
            TableUtils.createTableIfNotExists(connectionSource, InventoryStaffPo.class);
            inventoryStaffPos.create(new InventoryStaffPo("10001", "123", new Date(), "123", EmployeeState.Active));

            Dao<ManagerPo,String> managerPos =createDao(ManagerPo.class);
            TableUtils.dropTable(managerPos, true);
            TableUtils.createTableIfNotExists(connectionSource, ManagerPo.class);
            managerPos.create(new ManagerPo("10003", "总经理", new Date(), "123456", EmployeeState.Active));

            Dao<AdminPo,String> adminPos = createDao(AdminPo.class);
            TableUtils.dropTable(adminPos, true);
            TableUtils.createTableIfNotExists(connectionSource, AdminPo.class);
            adminPos.create(new AdminPo("10006", "管理员", new Date(), "123456", EmployeeState.Active));

            Dao<CommodityPo,String>commodityPos=createDao(CommodityPo.class);
            TableUtils.dropTable(commodityPos, true);
            TableUtils.createTableIfNotExists(connectionSource, CommodityPo.class);
            commodityPos.create(new CommodityPo("PRO-0002-0001","SmallLed","PRO-0002",13,new Date(),"һ",
                    "01",34,34,34,34,100,0));
            commodityPos.create(new CommodityPo("PRO-0002-0002","SmaqwellLed","PRO-0002",13,new Date(),"һ",
                    "01",34,34,34,34,100,0));
            commodityPos.create(new CommodityPo("PRO-0003-0001","SmaqweasqllLed","PRO-0003",13,new Date(),"һ",
                    "01",34,34,34,34,100,0));

            Dao<SaleBillPo,String>saleBillPos=createDao(SaleBillPo.class);
            TableUtils.dropTable(saleBillPos,true);
            TableUtils.createTableIfNotExists(connectionSource,SaleBillPo.class);

            Dao<TotalPricePromotionPo,String> promotions = createDao(TotalPricePromotionPo.class);
            TableUtils.dropTable(promotions,true);
            TableUtils.createTableIfNotExists(connectionSource,TotalPricePromotionPo.class);
            promotions.create(new TotalPricePromotionPo("ZJCXCL-20171112-00001",new Date(),new Date(), PromotionState.Waiting,200,1000,null));

            Dao<CommoditySortPo,String>commoditySortPos=createDao(CommoditySortPo.class);
            TableUtils.dropTable(commoditySortPos, true);
            TableUtils.createTableIfNotExists(connectionSource, CommoditySortPo.class);
            commoditySortPos.create(new CommoditySortPo("PRO-0001","Led",0,null,null));
            commoditySortPos.create(new CommoditySortPo("PRO-0002","DgLed",1,"PRO-0001",null));
            commoditySortPos.create(new CommoditySortPo("PRO-0003","qweLed",1,"PRO-0001",null));
            commoditySortPos.create(new CommoditySortPo("PRO-0004","qwasdeLed",0,"PRO-0001",null));

            Dao<ClientPo,String>clientPos=createDao(ClientPo.class);
            TableUtils.dropTable(clientPos,true);
            TableUtils.createTableIfNotExists(connectionSource,ClientPo.class);
            clientPos.create(new ClientPo("0",
                    ClientType.Retailer,
                    1,
                    "xiaoming",
                    "12345678",
                    "12345678",
                    "210000",
                    "12345679@qq.com",
                    666,
                    123,
                    456,
                    "10002",
                    ClientState.Real));
            clientPos.create(new ClientPo("1",
                    ClientType.Retailer,
                    1,
                    "xiaoming",
                    "12345678",
                    "12345678",
                    "210000",
                    "12345679@qq.com",
                    666,
                    123,
                    456,
                    "10002",
                    ClientState.Real));
            clientPos.create(new ClientPo("2",
                    ClientType.Retailer,
                    1,
                    "xiaoming",
                    "12345678",
                    "12345678",
                    "210000",
                    "12345679@qq.com",
                    666,
                    123,
                    456,
                    "10002",
                    ClientState.Real));
             } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
