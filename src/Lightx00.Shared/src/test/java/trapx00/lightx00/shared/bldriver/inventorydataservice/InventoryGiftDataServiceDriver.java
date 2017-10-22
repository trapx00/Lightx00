package trapx00.lightx00.shared.bldriver.inventorydataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryGiftDataServiceStub;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

import java.util.Date;

import static org.junit.Assert.*;

public class InventoryGiftDataServiceDriver {
    InventoryGiftDataService service=new InventoryGiftDataServiceStub();
    @Test
    public void getGift() throws Exception {

        assertEquals("G0001",service.getGift(new Date()).getId());

    }

    //@Test
   // public void init() throws Exception {
   // }

}