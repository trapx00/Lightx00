package trapx00.lightx00.client.presentationdriver.draftblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.client.blservicestub.draftblservice.DraftManagementBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import static org.junit.Assert.*;

public class DraftManagementBlServiceDriver {
    DraftManagementBlService service = new DraftManagementBlServiceStub();
    BillVo[] bills = null;
    @Before
    public void setUp() throws Exception {
        bills = service.update();
    }

    @Test
    public void update() throws Exception {
        assertNotNull(bills);
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(bills[0]));
    }

    @Test
    public void resume() throws Exception {
        assertEquals(ResultMessage.Success, service.resume(bills[0]));
    }

}