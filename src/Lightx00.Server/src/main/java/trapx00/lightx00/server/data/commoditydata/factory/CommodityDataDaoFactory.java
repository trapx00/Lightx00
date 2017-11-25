package trapx00.lightx00.server.data.commoditydata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

import java.sql.SQLException;

public class CommodityDataDaoFactory extends BaseDatabaseFactory {

    static {
        initTable(CommodityPo.class);
        initTable(CommoditySortPo.class);
    }

    private static Dao<CommodityPo, String> commodityDao;
    private static Dao<CommoditySortPo, String> commoditySortDao;


    public static Dao<CommodityPo, String> getCommodityDao() {
        if (commodityDao == null) {
            try {
                commodityDao = DaoManager.createDao(connectionSource,CommodityPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return commodityDao;
    }

    public static Dao<CommoditySortPo, String> getCommoditySortDao() {
        if (commoditySortDao == null) {
            try {
                commoditySortDao = DaoManager.createDao(connectionSource, CommoditySortPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return commoditySortDao;
    }

}
