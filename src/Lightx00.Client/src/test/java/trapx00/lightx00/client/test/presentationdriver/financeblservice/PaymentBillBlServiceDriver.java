package trapx00.lightx00.client.test.presentationdriver.financeblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.PaymentBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import static org.junit.Assert.*;

public class PaymentBillBlServiceDriver {
    PaymentBillBlService service = new PaymentBillBlServiceStub();
    PaymentBillVo bill = null;
    @Before
    public void setUp() throws Exception {
        bill = service.resume();
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(bill));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals( ResultMessage.Success, service.saveAsDraft(bill));
    }

    @Test
    public void resume() throws Exception {
        assertNotNull(bill);
    }


}