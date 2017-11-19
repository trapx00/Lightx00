package trapx00.lightx00.client.test.bl.financebl;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.bl.financebl.CashBillBlController;
import trapx00.lightx00.client.bl.financebl.factory.CashBillBlFactory;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

import static org.junit.Assert.*;

public class CashBillBlControllerTest {
    private CashBillBlController controller = CashBillBlFactory.getController();
    private CashBillVo cashBill = null;
    @Before
    public void setUp() {
        cashBill = new CashBillVo("123",new Date(), BillState.Draft,"123","123",null);
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, controller.submit(cashBill));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success, controller.saveAsDraft(cashBill));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("XJFYD-20171107-00001", controller.getId());
    }

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success, controller.deleteDraft("XJFYD-20171112-00001"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, controller.abandon("XJFYD-20171112-00001"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success, controller.activate("XJFYD-20171107-00001"));
    }

    @Test
    public void query() throws Exception {
        assertEquals(1, controller.query(x->true).length);
    }

}