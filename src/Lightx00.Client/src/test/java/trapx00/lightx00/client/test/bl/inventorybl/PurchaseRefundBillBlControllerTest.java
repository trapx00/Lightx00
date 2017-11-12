package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseRefundBillBlFactory;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseRefundBillBlControllerMock;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class PurchaseRefundBillBlControllerTest {

    PurchaseRefundBillBlController purchaseRefundBillBlController= PurchaseRefundBillBlFactory.getPurchaseRefundBillBlController();

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,purchaseRefundBillBlController.deleteDraft("0"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success,purchaseRefundBillBlController.abandon("0"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success,purchaseRefundBillBlController.activate("0"));
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,purchaseRefundBillBlController.submit(null));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,purchaseRefundBillBlController.saveAsDraft(null));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("0",purchaseRefundBillBlController.getId());
    }

    @Test
    public void queryPurchaseRefundBillVo() throws Exception {
        assertEquals("0",purchaseRefundBillBlController.queryPurchaseRefundBillVo(null)[0].getId());
    }

}