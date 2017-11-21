package trapx00.lightx00.server.data.promotiondata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;

import java.sql.SQLException;

public class ClientPromotionDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(ClientPromotionPo.class);
    }

    private static Dao<ClientPromotionPo,String> clientPromotionDao;

    /**
     * Create a clientPromotionDao.
     * @return clientPromotionDao
     */
    public static Dao<ClientPromotionPo,String> getClientPromotionDao() {
        if (clientPromotionDao == null) {
            try {
                clientPromotionDao = DaoManager.createDao(connectionSource, ClientPromotionPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return clientPromotionDao;
    }
}
