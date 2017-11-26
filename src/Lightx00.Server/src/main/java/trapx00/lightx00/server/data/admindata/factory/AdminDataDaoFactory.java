package trapx00.lightx00.server.data.admindata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
<<<<<<< HEAD
import trapx00.lightx00.server.data.saledata.SaleBillDataController;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.admin.AdminPo;
import trapx00.lightx00.shared.po.employee.EmployeePo;
=======
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.admin.AdminPo;
>>>>>>> ricering
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryStaffPo;
import trapx00.lightx00.shared.po.manager.ManagerPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;

import java.sql.SQLException;

public class AdminDataDaoFactory extends BaseDatabaseFactory {
    static {
<<<<<<< HEAD
        initTable(FinanceStaffPo.class);
        initTable(SaleStaffPo.class);
        initTable(AdminPo.class);
        initTable(InventoryStaffPo.class);
        initTable(ManagerPo.class);
    }
    private static Dao<AdminPo, String> adminDao;
    private static Dao<SaleStaffPo, String> saleStaffDao;
    private static Dao<InventoryStaffPo, String> inventoryStaffDao;
    private static Dao<ManagerPo, String> managerDao;
    private static Dao<FinanceStaffPo, String> financeStaffDao;

    public static Dao<AdminPo, String> getAdminDao() {
        if (adminDao == null) {
            try {
                adminDao = DaoManager.createDao(connectionSource, AdminPo.class);
=======
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
>>>>>>> ricering
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return adminDao;
    }

<<<<<<< HEAD
    public static Dao<SaleStaffPo, String> getSaleStaffDao() {
        if (saleStaffDao == null) {
            try {
                saleStaffDao = DaoManager.createDao(connectionSource, SaleStaffPo.class);
=======
    /**
     * Create a managerDao.
     * @return managerDao
     */
    public static Dao<ManagerPo,String> getManagerDao() {
        if (managerDao == null) {
            try {
                managerDao = DaoManager.createDao(connectionSource,ManagerPo.class);
>>>>>>> ricering
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
        return saleStaffDao;
    }

    public static Dao<InventoryStaffPo, String> getInventoryStaffDao() {
        if (inventoryStaffDao == null) {
            try {
                inventoryStaffDao = DaoManager.createDao(connectionSource, InventoryStaffPo.class);
=======
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
>>>>>>> ricering
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
        return inventoryStaffDao;
    }

    public static Dao<ManagerPo, String> getManagerDao() {
        if (managerDao == null) {
            try {
                managerDao = DaoManager.createDao(connectionSource, ManagerPo.class);
=======
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
>>>>>>> ricering
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
        return managerDao;
    }

    public static Dao<FinanceStaffPo, String> getFinanceStaffDao() {
        if (financeStaffDao == null) {
            try {
                financeStaffDao = DaoManager.createDao(connectionSource, FinanceStaffPo.class);
=======
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
>>>>>>> ricering
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
        return financeStaffDao;
=======
        return inventoryStaffDao;
>>>>>>> ricering
    }
}
