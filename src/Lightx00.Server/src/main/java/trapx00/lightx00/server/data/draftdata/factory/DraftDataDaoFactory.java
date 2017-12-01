package trapx00.lightx00.server.data.draftdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.draft.DraftPo;

import java.sql.SQLException;

public class DraftDataDaoFactory extends BaseDatabaseFactory {

    private static Dao<DraftPo, Integer> dao;

    public static Dao<DraftPo, Integer> getDao() {
        if (dao == null) {
            dao = createDao(DraftPo.class);
        }
        return dao;
    }
}
