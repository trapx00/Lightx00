package trapx00.lightx00.server.data.saledata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

import java.sql.SQLException;

public class SaleRefundBillDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<SaleRefundBillPo, String> saleRefundBillDao;

    static {
        initTable(SaleRefundBillPo.class);
    }

    public static Dao<SaleRefundBillPo, String> getSaleRefundBillDao() {
        if (saleRefundBillDao == null) {
            try {
                return saleRefundBillDao = DaoManager.createDao(connectionSource, SaleRefundBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return saleRefundBillDao;
    }
}
