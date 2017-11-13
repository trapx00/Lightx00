package trapx00.lightx00.server.test.data.inventorydata;

import trapx00.lightx00.server.data.inventorydata.factory.PurchaseRefundBillDataFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class PurchaseRefundBillDataControllerTest {
    PurchaseRefundBillDataService service = PurchaseRefundBillDataFactory.getService();

    @org.junit.Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(null));
    }


}
