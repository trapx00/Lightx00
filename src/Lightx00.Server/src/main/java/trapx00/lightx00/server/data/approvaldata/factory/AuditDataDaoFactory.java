package trapx00.lightx00.server.data.approvaldata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.bill.BillPo;

import java.sql.SQLException;

public class AuditDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(BillPo.class);
    }

    private static Dao<BillPo,String> auditDao;

    /**
     * Create a auditDao.
     * @return auditDao
     */
    public static Dao<BillPo,String> getAuditDao() {
        if (auditDao == null) {
            try {
                auditDao = DaoManager.createDao(connectionSource,BillPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return auditDao;
    }

}
