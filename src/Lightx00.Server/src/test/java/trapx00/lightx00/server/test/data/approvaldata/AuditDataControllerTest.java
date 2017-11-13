package trapx00.lightx00.server.test.data.approvaldata;

import org.junit.Test;
import trapx00.lightx00.server.data.approvaldata.factory.AuditDataFactory;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class AuditDataControllerTest {
    AuditDataService service = AuditDataFactory.getService();
    CashBillPo bill = new CashBillPo("0001",new Date(), BillState.Draft, "123","123",null);
    BillPo[] bills = {bill};
    @Test
    public void query() throws Exception {
        assertEquals(bills[0],service.query(x->true));
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
        assertEquals(ResultMessage.Success,service.pass(bill));
    }

}