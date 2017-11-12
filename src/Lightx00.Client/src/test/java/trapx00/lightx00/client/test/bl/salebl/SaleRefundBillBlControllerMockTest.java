package trapx00.lightx00.client.test.bl.salebl;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import trapx00.lightx00.client.bl.salebl.SaleRefundBillBlController;
import trapx00.lightx00.client.bl.salebl.factory.SaleRefundBillBlFactory;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class SaleRefundBillBlControllerMockTest {
    SaleRefundBillBlController saleRefundBillBlController= SaleRefundBillBlFactory.getSaleRefundBillBlController();

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,saleRefundBillBlController.deleteDraft("0"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success,saleRefundBillBlController.abandon("0"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success,saleRefundBillBlController.activate("0"));
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,saleRefundBillBlController.submit(null));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,saleRefundBillBlController.saveAsDraft(null));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("0",saleRefundBillBlController.getId());
    }

    @Test
    public void querySaleRefundBill() throws Exception {
        assertEquals("0",saleRefundBillBlController.querySaleRefundBill(null)[0].getId());
    }

}