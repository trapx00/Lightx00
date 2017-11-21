package trapx00.lightx00.server.data.promotiondata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;

import java.sql.SQLException;

public class ComSalePromotionDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(ComSalePromotionPo.class);
    }
    private static Dao<ComSalePromotionPo,String> comSalePromotionDao;

    /**
     * Create a comSalePromotionDao.
     * @return comSalePromotionDao
     */
    public static Dao<ComSalePromotionPo,String> getComSalePromotionDao() {
        if(comSalePromotionDao == null) {
            try {
                comSalePromotionDao = DaoManager.createDao(connectionSource,ComSalePromotionPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return comSalePromotionDao;
    }
}
