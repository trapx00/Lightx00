package trapx00.lightx00.shared.bldriver.commoditydataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.commoditydataservice.GoodsManagementDataService;
import trapx00.lightx00.shared.dataservicestub.commoditydataservice.GoodsManagementDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;

import static org.junit.Assert.*;

public class GoodsManagementDataServiceDriver {
    GoodsManagementDataService service=new GoodsManagementDataServiceStub();
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