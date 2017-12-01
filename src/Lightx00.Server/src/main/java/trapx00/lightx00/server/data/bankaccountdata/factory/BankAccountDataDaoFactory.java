package trapx00.lightx00.server.data.bankaccountdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import java.sql.SQLException;

public class BankAccountDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<BankAccountPo, Integer> bankAccountDao;

    public static Dao<BankAccountPo, Integer> getBankAccountDao() {
        if (bankAccountDao == null) {
            bankAccountDao = createDao(BankAccountPo.class);
        }
        return bankAccountDao;
    }
}
