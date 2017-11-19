package trapx00.lightx00.client.test.bl.approvalbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.client.bl.approvalbl.factory.AuditBlFactory;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditBlControllerTest {
    private AuditBlController controller = AuditBlFactory.getController();
    private CashBillVo bill = new CashBillVo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null);

    @Test
    public void reject() throws Exception {
        assertEquals(ResultMessage.Success,controller.reject(bill));
    }

    @Test
    public void pass() throws Exception {
        assertEquals(ResultMessage.Success,controller.pass(bill));
    }

    @Test
    public void query() throws Exception {
        assertEquals("XJFYD-20171112-00001",controller.query(x->true)[0].getId());
    }

    @Test
    public void requestApproval() throws Exception {
        assertEquals(ResultMessage.Success,controller.requestApproval(bill));
    }

}