package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlFactory;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class PurchaseBillBlControllerTest {

    PurchaseBillBlController purchaseBillBlController= PurchaseBillBlFactory.getPurchaseBillBlController();

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success,purchaseBillBlController.deleteDraft("0"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success,purchaseBillBlController.abandon("0"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success,purchaseBillBlController.activate("0"));
    }

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,purchaseBillBlController.submit(null));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,purchaseBillBlController.saveAsDraft(null));
    }

    @Test
    public void getId() throws Exception {
        assertEquals("0",purchaseBillBlController.getId());
    }

    @Test
    public void queryPurchaseBillVo() throws Exception {
        assertEquals("0",purchaseBillBlController.queryPurchaseBillVo(null)[0].getId());
    }

}