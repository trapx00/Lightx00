package trapx00.lightx00.server.test.data.inventorydata;

import org.junit.Test;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryGiftDataFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;

import java.util.Date;

import static org.junit.Assert.*;

public class InventoryGiftDataControllerTest {

    InventoryGiftDataService service= InventoryGiftDataFactory.getService();
    @Test
    public void getGift() throws Exception {
        assertEquals(null,null);
    }

    @Test
    public void getId() throws Exception {
        assertEquals("X0001",service.getId());
    }

}