package trapx00.lightx00.client.test.bl.approvalbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.client.bl.approvalbl.factory.AuditBlFactory;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditBlControllerTest {
    private AuditBlController controller = AuditBlFactory.getController();
    private CashBillVo bill = new CashBillVo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null);
    private BillInfoVo billInfo = new BillInfoVo("XJFYD-20171112-00001", BillType.FinanceBill,new Date(), BillState.WaitingForApproval);

    @Test
    public void reject() throws Exception {
        assertEquals(ResultMessage.Success,controller.reject(billInfo));
    }

    @Test
    public void pass() throws Exception {
        assertEquals(ResultMessage.Success,controller.pass(billInfo));
    }

    @Test
    public void query() throws Exception {
        assertEquals("XJFYD-20171112-00001",billInfo.getId());
    }

    @Test
    public void requestApproval() throws Exception {
        assertEquals(ResultMessage.Success,controller.requestApproval(bill));
    }

}