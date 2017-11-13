package trapx00.lightx00.server.test.data.saledata;

import trapx00.lightx00.server.data.saledata.factory.SaleBillDataFactory;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.assertEquals;

public class SaleBillDataControllerTest {
    SaleBillDataService service = SaleBillDataFactory.getSaleBillDataService();

    @org.junit.Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(null));
    }

}
