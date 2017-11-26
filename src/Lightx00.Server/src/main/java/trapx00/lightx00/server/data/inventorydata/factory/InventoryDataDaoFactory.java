package trapx00.lightx00.server.data.inventorydata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.inventorystaff.*;

import java.sql.SQLException;

public class InventoryDataDaoFactory extends BaseDatabaseFactory {

    static {
        initTable(InventoryDetailBillPo.class);
        initTable(InventoryGiftPo.class);
        initTable(InventoryViewPo.class);
       initTable(InventoryPicturePo.class);
    }

    private static Dao<InventoryDetailBillPo, String> inventoryDetailBillDao;
    private static Dao<InventoryGiftPo, String> inventoryGiftDao;
    private static Dao<InventoryViewPo,String> inventoryViewDao;
    private static Dao<InventoryPicturePo, String> inventoryPictureDao;


    public static Dao<InventoryDetailBillPo, String> getInventoryDetailBillDao() {
        if (inventoryDetailBillDao == null) {
            try {
                inventoryDetailBillDao = DaoManager.createDao(connectionSource,InventoryDetailBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inventoryDetailBillDao;
    }

    public static Dao<InventoryGiftPo, String> getInventoryGiftDao() {
        if (inventoryGiftDao == null) {
            try {
                inventoryGiftDao = DaoManager.createDao(connectionSource, InventoryGiftPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inventoryGiftDao;
    }

    public static Dao<InventoryViewPo, String> getInventoryViewDao() {
        if (inventoryViewDao == null) {
            try {
                inventoryViewDao = DaoManager.createDao(connectionSource, InventoryViewPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inventoryViewDao;
    }

    public static Dao<InventoryPicturePo, String> getInventoryPictureDao() {
        if (inventoryPictureDao == null) {
            try {
                inventoryPictureDao = DaoManager.createDao(connectionSource, InventoryPicturePo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return inventoryPictureDao;
    }
}
