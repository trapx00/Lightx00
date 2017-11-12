package trapx00.lightx00.shared.bldriver.approvaldataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.dataservicestub.approvaldataservice.AuditDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.util.Date;

import static org.junit.Assert.*;

public class AuditDataServiceDriver {
    AuditDataService service = new AuditDataServiceStub();
    BillPo bill = new CashBillPo("0001",new Date(), BillState.Draft, "123","123",null);
    @Test
    public void query() throws Exception {
        assertEquals("0001",bill.getId());
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