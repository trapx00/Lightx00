package trapx00.lightx00.server.data.admindata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.admin.AdminPo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryStaffPo;
import trapx00.lightx00.shared.po.manager.ManagerPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;

import java.sql.SQLException;

public class AdminDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(AdminPo.class);
        initTable(ManagerPo.class);
        initTable(SaleStaffPo.class);
        initTable(FinanceStaffPo.class);
        initTable(InventoryStaffPo.class);
    }
    private static Dao<AdminPo,String> adminDao;
    private static Dao<ManagerPo,String> managerDao;
    private static Dao<SaleStaffPo,String> saleStaffDao;
    private static Dao<FinanceStaffPo,String> financeStaffDao;
    private static Dao<InventoryStaffPo,String> inventoryStaffDao;

    /**
     * Create a adminDao.
     * @return adminDao
     */
    public static Dao<AdminPo,String> getAdminDao() {
        if (adminDao == null) {
            try {
                adminDao = DaoManager.createDao(connectionSource,AdminPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return adminDao;
    }

    /**
     * Create a managerDao.
     * @return managerDao
     */
    public static Dao<ManagerPo,String> getManagerDao() {
        if (managerDao == null) {
            try {
                managerDao = DaoManager.createDao(connectionSource,ManagerPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return managerDao;
    }

    /**
     * Create a saleStaffDao.
     * @return saleStaffDao
     */
    public static Dao<SaleStaffPo,String> getSaleStaffDao() {
        if (saleStaffDao == null) {
            try {
                saleStaffDao = DaoManager.createDao(connectionSource,SaleStaffPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return saleStaffDao;
    }

    /**
     * Create a financeStaffDao.
     * @return financeStaffDao
     */
    public static Dao<FinanceStaffPo,String> getFinanceStaffDao() {
        if (financeStaffDao == null) {
            try {
                financeStaffDao = DaoManager.createDao(connectionSource,FinanceStaffPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return financeStaffDao;
    }

    /**
     * Create a inventoryStaffDao.
     * @return inventoryStaffDao
     */
    public static Dao<InventoryStaffPo,String> getInventoryStaffDao() {
        if (inventoryStaffDao == null) {
            try {
                inventoryStaffDao = DaoManager.createDao(connectionSource,InventoryStaffPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inventoryStaffDao;
    }
}
