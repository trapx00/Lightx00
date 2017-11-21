package trapx00.lightx00.server.data.financedata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.sql.SQLException;

public class FinanceDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(CashBillPo.class);
    }

    private static Dao<CashBillPo, String> cashBillDao;

    public static Dao<CashBillPo, String> getCashBillDao() {
        if (cashBillDao==null) {
            try {
                cashBillDao = DaoManager.createDao(connectionSource,CashBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cashBillDao;
    }
}
