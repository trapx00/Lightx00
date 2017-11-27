package trapx00.lightx00.client.test.presentationdriver.approvalblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.blservicestub.approvalblservice.AuditBlServiceStub;
import trapx00.lightx00.client.vo.manager.BillInfoVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditBlServiceDriver {
    private AuditBlService service = new AuditBlServiceStub();
    private BillInfoVo billInfo = new BillInfoVo("XJFYD-20171112-00001", BillType.FinanceBill,new Date(), BillState.WaitingForApproval);

    @Test
    public void query() throws Exception {
        assertEquals("XJFYD-20171112-00001",billInfo.getId());
    }

    @Test
    public void reject() throws Exception {
        assertEquals(ResultMessage.Success,service.reject(billInfo));
    }

    @Test
    public void pass() throws Exception {
        assertEquals(ResultMessage.Success,service.pass(billInfo));
    }

}