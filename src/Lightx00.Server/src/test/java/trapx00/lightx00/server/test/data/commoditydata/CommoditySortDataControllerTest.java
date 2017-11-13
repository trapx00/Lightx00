package trapx00.lightx00.server.test.data.commoditydata;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.commoditydata.factory.CommoditySortDataFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

import static org.junit.Assert.*;

public class CommoditySortDataControllerTest {
    CommoditySortDataService service= CommoditySortDataFactory.getCommoditySortDataService();

    CommoditySortPo[] commoditysorts;
    String commodityIdList[]={""};
    String nextIds[]={"S0002"};
    CommoditySortPo Led=new CommoditySortPo("S0001","Led", null,
            "",  nextIds);

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
        assertEquals("S0001","S0001");
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(Led));
    }

    @Test
    public void display() throws Exception {
        assertEquals("S0001",service.dispaly(Led)[0].getId());
    }

    @Test
    public void dispaly() throws Exception {
        assertEquals("S0001",service.display()[0].getId());
    }

}