package trapx00.lightx00.server.data.financedata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;
import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;

import java.sql.SQLException;

public class FinanceDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(CashBillPo.class);
        initTable(PaymentBillPo.class);
        initTable(ReceivalBillPo.class);
        initTable(SystemSnapshotPo.class);
    }

    private static Dao<CashBillPo, String> cashBillDao;
    private static Dao<PaymentBillPo, String> paymentBillDao;
    private static Dao<ReceivalBillPo,String> receivalBillDao;
    private static Dao<SystemSnapshotPo, String> systemSnapshotDao;


    public static Dao<CashBillPo, String> getCashBillDao() {
        if (cashBillDao == null) {
            try {
                cashBillDao = DaoManager.createDao(connectionSource,CashBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cashBillDao;
    }

    public static Dao<PaymentBillPo, String> getPaymentBillDao() {
        if (paymentBillDao == null) {
            try {
                paymentBillDao = DaoManager.createDao(connectionSource, PaymentBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return paymentBillDao;
    }

    public static Dao<ReceivalBillPo, String> getReceivalBillDao() {
        if (receivalBillDao == null) {
            try {
                receivalBillDao = DaoManager.createDao(connectionSource, ReceivalBillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return receivalBillDao;
    }

    public static Dao<SystemSnapshotPo, String> getSystemSnapshotDao() {
        if (systemSnapshotDao == null) {
            try {
                systemSnapshotDao = DaoManager.createDao(connectionSource, SystemSnapshotPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return systemSnapshotDao;
    }
}
