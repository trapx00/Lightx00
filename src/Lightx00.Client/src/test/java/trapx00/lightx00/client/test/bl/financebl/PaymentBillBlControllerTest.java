package trapx00.lightx00.client.test.bl.financebl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.financebl.CashBillBlController;
import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.bl.financebl.factory.CashBillFactory;
import trapx00.lightx00.client.bl.financebl.factory.PaymentBillFactory;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

import static org.junit.Assert.*;

public class PaymentBillBlControllerTest {
    private PaymentBillBlController controller = PaymentBillFactory.getController();
    private PaymentBillVo bill = null;
    @Before
    public void setUp() {
        bill = controller.query(x->true)[0];
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, controller.submit(bill));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success, controller.saveAsDraft(bill));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("FXD-20171112-00001", controller.getId());
    }

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success, controller.deleteDraft("FXD-20171112-00001"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, controller.abandon("FXD-20171112-00001"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success, controller.activate("FXD-20171112-00001"));
    }

    @Test
    public void query() throws Exception {
        assertNotNull(bill);
    }

}