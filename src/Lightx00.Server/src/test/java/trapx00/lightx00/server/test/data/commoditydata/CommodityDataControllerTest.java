package trapx00.lightx00.server.test.data.commoditydata;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

import static org.junit.Assert.*;

public class CommodityDataControllerTest {
    CommodityDataService service= CommodityDataFactory.getController();

    Date date=new Date() ;

    CommodityPo LedLight=new CommodityPo("C0001","LedLight", "Led", 98, date,
            "1", "2", 56, 60, 90, 99, 50);

    CommodityPo[] commoditys;

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(LedLight));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(LedLight));
    }

    @Test
    public void query() throws Exception {
        assertEquals("C0001","C0001" );
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(LedLight) );
    }

}