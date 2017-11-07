package trapx00.lightx00.client.test.presentationdriver.draftblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.draftblservice.DraftManagementBlService;
import trapx00.lightx00.client.blservicestub.draftblservice.DraftManagementBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.Draftable;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import java.util.Date;

import static org.junit.Assert.*;

public class DraftManagementBlServiceDriver {
    private DraftManagementBlService service = new DraftManagementBlServiceStub();
    private Draftable[] draftables = null;
    @Before
    public void setUp() throws Exception {
        draftables = new Draftable[]{
                new PaymentBillVo("123",new Date(), BillState.Rejected, "" ,"" ,null,0)
        };
    }

    @Test
    public void update() throws Exception {
        assertNotNull(draftables);
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success, service.delete(draftables[0]));
    }


}