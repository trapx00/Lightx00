package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlInfo;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlInfoFactory;

import static org.junit.Assert.*;

public class PurchaseBillBlInfoControllerTest {

    PurchaseBillBlInfo purchaseBillBlInfo=PurchaseBillBlInfoFactory.getPurchaseBillBlInfo();

    @Test
    public void queryPurchaseBillVo() throws Exception {
        assertEquals("0",purchaseBillBlInfo.queryPurchaseBillVo(null));
    }

    @Test
    public void queryPurchaseRefundBillVo() throws Exception {
        assertEquals("0",purchaseBillBlInfo.queryPurchaseRefundBillVo(null));
    }

}