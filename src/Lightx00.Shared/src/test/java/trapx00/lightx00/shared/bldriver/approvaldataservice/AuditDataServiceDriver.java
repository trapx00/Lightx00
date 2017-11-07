package trapx00.lightx00.shared.bldriver.approvaldataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.dataservicestub.approvaldataservice.AuditDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.client.vo.BillVo;

import static org.junit.Assert.*;

public class AuditDataServiceDriver {
    AuditDataService service = new AuditDataServiceStub();
    BillVo bill = service.query("0001", BillType.FinanceBill,null,null)[0];
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