package trapx00.lightx00.server.data.inventorydata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

import java.sql.SQLException;

public class PurchaseBillDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<PurchaseBillPo, String> purchaseBillDao;

    static {
        initTable(PurchaseBillPo.class);
    }

    public static Dao<PurchaseBillPo, String> getPurchaseBillDao() {
        if (purchaseBillDao == null) {
            try {
                return purchaseBillDao = DaoManager.createDao(connectionSource, PurchaseBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return purchaseBillDao;
    }
}
