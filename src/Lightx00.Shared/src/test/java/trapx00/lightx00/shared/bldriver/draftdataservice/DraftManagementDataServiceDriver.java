package trapx00.lightx00.shared.bldriver.draftdataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.dataservicestub.draftdataservice.DraftManagementDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class DraftManagementDataServiceDriver {
    DraftManagementDataService service = new DraftManagementDataServiceStub();
    @Test
    public void update() throws Exception {
        assertEquals("123",service.update(x->true)[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(service.update(x->true)[0].getId()));
    }

}