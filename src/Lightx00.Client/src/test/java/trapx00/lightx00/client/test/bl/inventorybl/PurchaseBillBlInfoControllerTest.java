package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlController;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlInfo;
import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseBillBlInfoFactory;
import trapx00.lightx00.client.bl.inventorybl.factory.PurchaseRefundBillBlFactory;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;
import trapx00.lightx00.shared.queryvo.PurchaseBillQueryVo;
import trapx00.lightx00.shared.queryvo.PurchaseRefundBillQueryVo;

import static org.junit.Assert.*;

public class PurchaseBillBlInfoControllerTest {

    PurchaseBillBlInfo purchaseBillBlInfo = PurchaseBillBlInfoFactory.getPurchaseBillBlInfo();
    PurchaseBillBlController purchaseBillBlController = PurchaseBillBlFactory.getPurchaseBillBlController();
    PurchaseRefundBillBlController purchaseRefundBillBlController = PurchaseRefundBillBlFactory.getPurchaseRefundBillBlController();
    PurchaseBillVo purchaseBillVo=new PurchaseBillVo("0",null,null,null,"1",1,null,null,100,null);
    PurchaseRefundBillVo purchaseRefundBillVo=new PurchaseRefundBillVo("0",null,null,null,1,null,null,100,null);

    @Test
    public void queryPurchaseBillVo() throws Exception {
        purchaseBillBlController.submit(purchaseBillVo);
        assertEquals("0", purchaseBillBlInfo.queryPurchaseBillVo(new PurchaseBillQueryVo().idEq("0"))[0].getId());
        purchaseBillBlController.abandon("0");
    }

    @Test
    public void queryPurchaseRefundBillVo() throws Exception {
        purchaseRefundBillBlController.submit(purchaseRefundBillVo);
        assertEquals("0", purchaseBillBlInfo.queryPurchaseRefundBillVo(new PurchaseRefundBillQueryVo().idEq("0"))[0].getId());
        purchaseRefundBillBlController.abandon("0");
    }

}