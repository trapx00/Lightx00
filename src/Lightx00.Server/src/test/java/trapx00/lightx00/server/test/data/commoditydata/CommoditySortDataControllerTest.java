package trapx00.lightx00.server.test.data.commoditydata;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataDaoFactory;
import trapx00.lightx00.server.data.commoditydata.factory.CommoditySortDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class CommoditySortDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Dao<CommoditySortPo, String> dao = CommodityDataDaoFactory.getCommoditySortDao();
    private CommoditySortDataService service= CommoditySortDataFactory.getCommoditySortDataService();
    private  CommoditySortPo commoditySortPo = new CommoditySortPo("PRO-0001","Led",null,null);
    private  CommoditySortPo commoditySortPo1 = new CommoditySortPo("PRO-0002","Led",null,"PRO-0001");

    @Before
    public void setUp() throws Exception {
    }

    private void resetTable() throws Exception {
        TableUtils.dropTable(dao.getConnectionSource(),CommoditySortPo.class,true);
        TableUtils.createTable(dao.getConnectionSource(), CommoditySortPo.class);
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(commoditySortPo,commoditySortPo1));
        resetTable();
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commoditySortPo));
        resetTable();
    }

    @Test
    public void query() throws Exception {
        dao.create(commoditySortPo);
        assertEquals(1, service.query(new CommoditySortQueryVo(q->q.where().eq("id","PRO-0001").prepare())).length);
        resetTable();
    }

    @Test
    public void delete() throws Exception {
        dao.create(commoditySortPo);
        assertEquals(ResultMessage.Success,service.delete(commoditySortPo));
        resetTable();
    }

    @Test
    public void display() throws Exception {
        dao.create(commoditySortPo);
        assertEquals("PRO-0001",service.display()[0].getId());
        resetTable();
    }

  //  @Test
  //  public void dispalyChildSort() throws Exception {
  //      dao.create(commoditySortPo1);
  //      assertEquals("PRO-0002",service.dispaly(commoditySortPo)[0].getId());
   //     dao.delete(commoditySortPo1);
  //  }

}