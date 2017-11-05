package trapx00.lightx00.shared.bldriver.financedataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.CashBillDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.util.Date;

import static org.junit.Assert.*;

public class CashBillDataServiceDriver {

    CashBillDataService service = new CashBillDataServiceStub();
    final CashBillPo bill = new CashBillPo("123",new Date(), BillState.Draft, "123","123",null);
    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success, service.submit(bill));

    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success, service.activate(bill.getId()));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, service.abandon(bill.getId()));
    }

}