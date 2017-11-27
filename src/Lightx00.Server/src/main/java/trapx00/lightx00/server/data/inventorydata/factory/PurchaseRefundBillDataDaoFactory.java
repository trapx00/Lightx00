package trapx00.lightx00.server.data.inventorydata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

import java.sql.SQLException;

public class PurchaseRefundBillDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<PurchaseRefundBillPo, String> purchaseRefundBillDao;

    static {
        initTable(PurchaseRefundBillPo.class);
    }

    public static Dao<PurchaseRefundBillPo, String> getPurchaseRefundBillDao() {
        if (purchaseRefundBillDao == null) {
            try {
                return purchaseRefundBillDao = DaoManager.createDao(connectionSource, PurchaseRefundBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return purchaseRefundBillDao;
    }
}
