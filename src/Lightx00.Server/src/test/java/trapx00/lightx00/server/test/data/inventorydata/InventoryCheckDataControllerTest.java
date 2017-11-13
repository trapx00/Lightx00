package trapx00.lightx00.server.test.data.inventorydata;

import org.junit.Test;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryCheckDataFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;

import java.util.Date;

import static org.junit.Assert.*;

public class InventoryCheckDataControllerTest {

    InventoryCheckDataService service= InventoryCheckDataFactory.getService();

    @Test
    public void check() throws Exception {
        String result=String.valueOf(service.submit(new Date(),new Date()).getSum());
        assertEquals("208.0",result);
    }

    @Test
    public void picture() throws Exception {

        assertEquals("C0001",service.submit(new Date()).getItems()[0].getId());
    }

}