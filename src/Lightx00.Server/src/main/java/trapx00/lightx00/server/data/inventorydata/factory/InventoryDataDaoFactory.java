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
    }
    private static Dao<InventoryGiftPo, String> inventoryGiftDao;
    private static Dao<InventoryDetailBillPo, String> inventoryDetailBillDao;

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


}
