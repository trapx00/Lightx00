package trapx00.lightx00.server.test.data.inventorydata;

import trapx00.lightx00.server.data.inventorydata.factory.PurchaseBillDataFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class PurchaseBillDataControllerTest {
    PurchaseBillDataService service = PurchaseBillDataFactory.getPurchaseBillDataService();

    @org.junit.Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(null));
    }

}
