package trapx00.lightx00.shared.bldriver.commoditydataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.CommodityDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;

import static org.junit.Assert.*;

public class CommodityDataServiceDriver {
    CommodityDataService service=new CommodityDataServiceStub();
    CommodityPo commodityPo=null;
    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(commodityPo));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commodityPo));
    }

    @Test
    public void query() throws Exception {
        CommodityQueryVo commodityQueryVo=new CommodityQueryVo();
        commodityQueryVo.setId("C0001");
        commodityQueryVo.setName("LedLight");
        assertEquals("C0001",service.query(commodityQueryVo)[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(commodityPo));
    }

   // @Test
    //public void init() throws Exception {

    //}

}