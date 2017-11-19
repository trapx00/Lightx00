package trapx00.lightx00.client.test.presentationdriver.approvalblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.approvalblservice.AuditBlService;
import trapx00.lightx00.client.blservicestub.approvalblservice.AuditBlServiceStub;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.queryvo.BillQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditBlServiceDriver {
    private AuditBlService service = new AuditBlServiceStub();
    private CashBillVo bill = new CashBillVo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null);
    @Test
    public void query() throws Exception {
        assertEquals("XJFYD-20171112-00001",service.query(x->true)[0].getId());
    }

    @Test
    public void reject() throws Exception {
        assertEquals(ResultMessage.Success,service.reject(bill));
    }

    @Test
    public void pass() throws Exception {
        assertEquals(ResultMessage.Success,service.pass(bill));
    }

}