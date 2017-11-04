package trapx00.lightx00.client.test.presentationdriver.financeblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.CashBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;

import static org.junit.Assert.*;

public class CashBillBlServiceDriver {
    CashBillBlService service = new CashBillBlServiceStub();
    CashBillVo cashBills = null;
    @Before
    public void setUp() throws Exception {
        cashBills = service.resume();
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(cashBills));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success, service.saveAsDraft(cashBills));
    }

    @Test
    public void resume() throws Exception {
        assertNotNull(cashBills);
    }

}