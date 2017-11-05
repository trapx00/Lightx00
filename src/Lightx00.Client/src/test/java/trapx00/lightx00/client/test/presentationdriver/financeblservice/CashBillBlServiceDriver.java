package trapx00.lightx00.client.test.presentationdriver.financeblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.CashBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import java.util.Date;

import static org.junit.Assert.*;

public class CashBillBlServiceDriver {
    CashBillBlService service = new CashBillBlServiceStub();
    CashBillVo cashBill = null;
    @Before
    public void setUp() throws Exception {
        cashBill = new CashBillVo("123",new Date(), BillState.Draft,"123","123",null);
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(cashBill));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success, service.saveAsDraft(cashBill));
    }

    @Test
    public void resume() throws Exception {
        assertNotNull(cashBill);
    }

}