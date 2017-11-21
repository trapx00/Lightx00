package trapx00.lightx00.server.data.promotiondata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;

import java.sql.SQLException;

public class TotalPricePromotionDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(TotalPricePromotionPo.class);
    }

    private static Dao<TotalPricePromotionPo,String> totalPricePromotionDao;

    /**
     * Create a totalPricePromotionDao.
     * @return totalPricePromotionDao
     */
    public static Dao<TotalPricePromotionPo,String> getTotalPricePromotionDao() {
        if(totalPricePromotionDao == null){
            try {
                totalPricePromotionDao = DaoManager.createDao(connectionSource,TotalPricePromotionPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return totalPricePromotionDao;
    }
}
