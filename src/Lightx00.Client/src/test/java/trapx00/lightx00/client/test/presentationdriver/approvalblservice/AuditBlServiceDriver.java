package trapx00.lightx00.client.test.presentationdriver.approvalblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.blservicestub.approvalblservice.AuditBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditBlServiceDriver {
    AuditBlService service = new AuditBlServiceStub();
    @Test
    public void query() throws Exception {
        BillQueryVo query = new BillQueryVo("0001",BillType.FinanceBill,new Date(), BillState.WaitingForApproval);
        assertEquals("0001",service.query(query)[0].getId());
    }

    @Test
    public void reject() throws Exception {
        BillVo bill = new BillVo(BillType.FinanceBill,"0001",new Date(), BillState.WaitingForApproval);
        assertEquals(ResultMessage.Success,service.reject(bill));
    }

    @Test
    public void pass() throws Exception {
        BillVo bill = new BillVo(BillType.FinanceBill,"0001",new Date(), BillState.WaitingForApproval);
        assertEquals(ResultMessage.Success,service.pass(bill));
    }

}