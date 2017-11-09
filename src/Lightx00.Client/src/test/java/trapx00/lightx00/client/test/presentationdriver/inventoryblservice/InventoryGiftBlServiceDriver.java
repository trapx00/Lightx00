package trapx00.lightx00.client.test.presentationdriver.inventoryblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservicestub.inventoryblservice.InventoryGiftBlServiceStub;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;

import java.util.Date;

public class InventoryGiftBlServiceDriver {
    InventoryGiftBlService service=new InventoryGiftBlServiceStub();
    Date date=new Date();
    InventoryGiftVo gifts=new InventoryGiftVo(date,"G0001",null);
    @Test
    public void sumbit() throws Exception {
        assertEquals("G0001",service.sumbit(gifts).getId());
    }

}