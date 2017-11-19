package trapx00.lightx00.shared.bldriver.approvaldataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.dataservicestub.approvaldataservice.AuditDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditDataServiceDriver {
    private AuditDataService service = new AuditDataServiceStub();
    private CashBillPo bill = new CashBillPo("XJFYD-20171112-00001",new Date(), BillState.WaitingForApproval,"0001","0002",null);
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

    @Test
    public void requestApproval() throws Exception {
        assertEquals(ResultMessage.Success,service.requestApproval(bill));
    }
}