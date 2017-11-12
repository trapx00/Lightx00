package trapx00.lightx00.client.test.bl.commoditybl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.client.bl.commoditybl.factory.CommodityServiceFactory;
import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.po.ResultMessage;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CommodityBlControllerTest {

    private CommodityBlController commodityBlController= CommodityServiceFactory.getController();

    Date date=new Date() ;

    CommodityVo LedLight=new CommodityVo("C0001","LedLight", "Led", 98, date,
            "1", "2", 56, 60, 90, 99, 50);

    CommodityVo[] commoditys;
    @Before
    public void setup()throws Exception{

        commoditys=commodityBlController.query(new CommodityQueryVo("C0001","LedLight"));
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,commodityBlController.add(LedLight));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,commodityBlController.modify(LedLight));
    }

    @Test
    public void query() throws Exception {
        assertEquals("C0001",commoditys[0].getId() );
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,commodityBlController.delete(LedLight) );
    }

    @Test
    public void queryCommodity() throws Exception {
    }

    @Test
    public void modifyInventory() throws Exception {
    }

}
