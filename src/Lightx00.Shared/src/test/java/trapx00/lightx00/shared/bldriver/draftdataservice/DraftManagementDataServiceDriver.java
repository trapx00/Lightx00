package trapx00.lightx00.shared.bldriver.draftdataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;
import trapx00.lightx00.shared.dataservicestub.draftdataservice.DraftManagementDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.DraftQueryVo;

import static org.junit.Assert.*;

public class DraftManagementDataServiceDriver {
    private DraftManagementDataService service = new DraftManagementDataServiceStub();
    @Test
    public void update() throws Exception {
        assertEquals("FXD-123",service.update(new DraftQueryVo())[0].getDraftId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(service.update(new DraftQueryVo())[0].getId()));
    }

}