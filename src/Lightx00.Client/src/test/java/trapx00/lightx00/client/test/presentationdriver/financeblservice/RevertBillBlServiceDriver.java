package trapx00.lightx00.client.test.presentationdriver.financeblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.RevertBillBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.RevertBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;

import java.util.Date;

import static org.junit.Assert.*;

public class RevertBillBlServiceDriver {
    RevertBillBlService service = new RevertBillBlServiceStub();
    @Test
    public void init() throws Exception {
        assertEquals(ResultMessage.Success,
                service.init(
                new PaymentBillVo("123", new Date(),
                        BillState.Draft, null,null,null,10)));
    }

}