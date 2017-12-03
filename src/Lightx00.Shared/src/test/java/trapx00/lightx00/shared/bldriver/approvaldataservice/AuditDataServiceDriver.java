package trapx00.lightx00.shared.bldriver.approvaldataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.dataservicestub.approvaldataservice.AuditDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.AuditIdPo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditDataServiceDriver {
    private AuditDataService service = new AuditDataServiceStub();
    private BillPo bill = new BillPo(BillType.FinanceBill,"XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval);
    private AuditIdPo auditId = new AuditIdPo("XJFYD-20171112-00001",new Date());
    @Test
    public void query() throws Exception {
        assertEquals("XJFYD-20171112-00001",auditId.getId());
    }

    @Test
    public void reject() throws Exception {
        assertEquals(ResultMessage.Success,service.reject(auditId));
    }

    @Test
    public void pass() throws Exception {
        assertEquals(ResultMessage.Success,service.pass(auditId));
    }

    @Test
    public void requestApproval() throws Exception {
        assertEquals(ResultMessage.Success,service.requestApproval(auditId.getId()));
    }
}