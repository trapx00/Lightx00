package trapx00.lightx00.client.test.presentationdriver.draftblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.draftblservice.DraftBlService;
import trapx00.lightx00.client.blservicestub.draftblservice.DraftBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;

import java.util.Date;

import static org.junit.Assert.*;

public class DraftBlServiceDriver {
    private DraftBlService service = new DraftBlServiceStub();
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