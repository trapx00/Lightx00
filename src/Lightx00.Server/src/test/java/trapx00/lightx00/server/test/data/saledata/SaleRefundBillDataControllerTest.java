package trapx00.lightx00.server.test.data.saledata;

import trapx00.lightx00.server.data.saledata.factory.SaleRefundBillDataFactory;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class SaleRefundBillDataControllerTest {
    SaleRefundBillDataService service = SaleRefundBillDataFactory.getService();

    @org.junit.Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(null));
    }

}
