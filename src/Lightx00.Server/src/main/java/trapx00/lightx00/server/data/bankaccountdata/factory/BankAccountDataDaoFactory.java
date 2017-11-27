package trapx00.lightx00.server.data.bankaccountdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import java.sql.SQLException;

public class BankAccountDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(BankAccountPo.class);
    }
    private static Dao<BankAccountPo, Integer> bankAccountDao;

    public static Dao<BankAccountPo, Integer> getBankAccountDao() {
        if (bankAccountDao == null) {
            try {
                bankAccountDao = DaoManager.createDao(connectionSource, BankAccountPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bankAccountDao;
    }
}
