package trapx00.lightx00.shared.bldriver.commoditydataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.commoditydataservice.ProductManagementDataService;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.ProductManagementDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

import static org.junit.Assert.*;

public class ProductManagementDataServiceDriver {
    ProductManagementDataService service=new ProductManagementDataServiceStub();
    CommoditySortPo commoditySortPo=null;
    CommoditySortPo fatheCommoditySortPo=null;
    String commodityIdList[]={""};
    String nextIds[]={"S0002"};
    CommoditySortPo Led=new CommoditySortPo("S0001","Led", null,
            "",  nextIds);

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(commoditySortPo,fatheCommoditySortPo));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commoditySortPo));
    }

    @Test
    public void query() throws Exception {
        assertEquals("S0001",service.query("S0001","Led")[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(commoditySortPo));
    }

    @Test
    public void display() throws Exception {
        assertEquals("S0001",service.display()[0].getId());
    }

    @Test
    public void dispaly() throws Exception {
        assertEquals("S0002",service.dispaly(Led)[0].getId());
    }

    //@Test
   // public void init() throws Exception {
   // }

}