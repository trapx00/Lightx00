package trapx00.lightx00.server.test.data.commoditydata;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataDaoFactory;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class CommodityDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Dao<CommodityPo, String> dao = CommodityDataDaoFactory.getCommodityDao();
    private CommodityDataService service= CommodityDataFactory.getController();
    private  CommodityPo commodityPo = new CommodityPo("PRO-0001-0001","SmallLed","Led",13,new Date(),"一",
            "01",34,34,34,34,100);

    @Before
    public void setUp() throws Exception {
        dao.deleteById(commodityPo.getId());
    }
    private void resetTable() throws Exception {
        TableUtils.dropTable(dao.getConnectionSource(),CommodityPo.class,true);
        TableUtils.createTable(dao.getConnectionSource(), CommodityPo.class);
    }

    @Test
    public void add() throws Exception {
        try {
            assertEquals(ResultMessage.Success,service.add(commodityPo));
        } finally {
            resetTable();
        }
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commodityPo));
        resetTable();
    }

    @Test
    public void query() throws Exception {
        dao.create(commodityPo);
        assertEquals(1, service.query(new CommodityQueryVo().eq("id","PRO-0001-0001")).length);
        resetTable();
    }

    @Test
    public void delete() throws Exception {
        dao.create(commodityPo);
        assertEquals(ResultMessage.Success,service.delete(commodityPo) );
        resetTable();
    }

}