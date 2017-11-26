package trapx00.lightx00.server.data.promotiondata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;

import java.sql.SQLException;

public class PromotionDataDaoFactory extends BaseDatabaseFactory {
    static {
        initTable(ClientPromotionPo.class);
        initTable(ComSalePromotionPo.class);
        initTable(TotalPricePromotionPo.class);
    }

    private static Dao<ClientPromotionPo,String> clientPromotionDao;
    private static Dao<ComSalePromotionPo,String> comSalePromotionDao;
    private static Dao<TotalPricePromotionPo,String> totalPricePromotionDao;

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

    /**
     * Create a comSalePromotionDao.
     * @return comSalePromotionDao
     */
    public static Dao<ComSalePromotionPo,String> getComSalePromotionDao() {
        if (comSalePromotionDao == null) {
            try {
                comSalePromotionDao = DaoManager.createDao(connectionSource,ComSalePromotionPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return comSalePromotionDao;
    }

    /**
     * Create a totalPricePromotionDao.
     * @return totalPricePromotionDao
     */
    public static Dao<TotalPricePromotionPo,String> getTotalPricePromotionDao() {
        if (totalPricePromotionDao == null) {
            try {
                totalPricePromotionDao = DaoManager.createDao(connectionSource,TotalPricePromotionPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return totalPricePromotionDao;
    }
}
