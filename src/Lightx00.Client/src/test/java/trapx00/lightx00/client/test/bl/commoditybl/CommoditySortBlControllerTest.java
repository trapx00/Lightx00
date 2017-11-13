package trapx00.lightx00.client.test.bl.commoditybl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.client.bl.commoditybl.factory.CommoditySortServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class CommoditySortBlControllerTest {

    private CommoditySortBlController service= CommoditySortServiceFactory.getController();
    CommoditySortVo[] commoditysorts;
    String commodityIdList[]={""};
    String nextIds[]={"S0002"};
    CommoditySortVo Led=new CommoditySortVo("S0001","Led", null,
            "",  nextIds);

    @Before
    public void setUp() throws Exception {
        commoditysorts = service.query(new CommoditySortQueryVo("S0001","Led","S0000"));
    }
    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(Led,null));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(Led));
    }

    @Test
    public void query() throws Exception {
        assertEquals("S0001",commoditysorts[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(Led));
    }

    @Test
    public void display() throws Exception {
        assertEquals("S0002",service.dispaly(Led)[0].getId());
    }

    @Test
    public void dispaly() throws Exception {
        assertEquals("S0001",service.display()[0].getId());
    }
 //   @Test
  //  public void queryCommoditySort() throws Exception {
  //  }
}
