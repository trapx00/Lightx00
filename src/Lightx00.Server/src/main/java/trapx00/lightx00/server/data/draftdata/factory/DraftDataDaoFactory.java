package trapx00.lightx00.server.data.draftdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.draft.DraftPo;

import java.sql.SQLException;

public class DraftDataDaoFactory extends BaseDatabaseFactory {
    static {
        BaseDatabaseFactory.initTable(DraftPo.class);
    }

    private static Dao<DraftPo, Integer> dao;

    public static Dao<DraftPo, Integer> getDao() {
        if (dao == null) {
            try {
                dao = DaoManager.createDao(connectionSource,DraftPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dao;
    }
}
