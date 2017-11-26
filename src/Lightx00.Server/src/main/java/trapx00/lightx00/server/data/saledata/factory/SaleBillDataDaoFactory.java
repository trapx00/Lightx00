package trapx00.lightx00.server.data.saledata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;
import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

import java.sql.SQLException;

public class SaleBillDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<SaleBillPo, String> saleBillDao;

    static {
        initTable(SaleBillPo.class);
    }

    public static Dao<SaleBillPo, String> getSaleBillDao() {
        if (saleBillDao == null) {
            try {
                return saleBillDao = DaoManager.createDao(connectionSource, SaleBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return saleBillDao;
    }
}
