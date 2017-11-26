package trapx00.lightx00.server.test.data.commoditydata;

import com.j256.ormlite.dao.Dao;
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
        dao.deleteById(commoditySortPo.getId());
        dao.deleteById(commoditySortPo1.getId());
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(commoditySortPo,commoditySortPo1));
        dao.delete(commoditySortPo);
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commoditySortPo));
        dao.delete(commoditySortPo);
    }

    @Test
    public void query() throws Exception {
        dao.create(commoditySortPo);
        assertEquals(1, service.query(new CommoditySortQueryVo(q->q.where().eq("id","PRO-0001").prepare())).length);
        dao.delete(commoditySortPo);
    }

    @Test
    public void delete() throws Exception {
        dao.create(commoditySortPo);
        assertEquals(ResultMessage.Success,service.delete(commoditySortPo));
    }

    @Test
    public void display() throws Exception {
        dao.create(commoditySortPo);
        assertEquals("PRO-0001",service.display()[0].getId());
        dao.deleteById(commoditySortPo.getId());
    }

  //  @Test
  //  public void dispalyChildSort() throws Exception {
  //      dao.create(commoditySortPo1);
  //      assertEquals("PRO-0002",service.dispaly(commoditySortPo)[0].getId());
   //     dao.delete(commoditySortPo1);
  //  }

}