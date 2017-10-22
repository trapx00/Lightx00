package trapx00.lightx00.client.presentationdriver.inventoryblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.client.blservicestub.inventoryblservice.PurchaseBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillVo;

import static org.junit.Assert.*;

public class PurchaseBillBlServiceDriver {

    PurchaseBillBlService service=new PurchaseBillBlServiceStub();
    PurchaseBillVo purchaseBillVo;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(purchaseBillVo));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.saveAsDraft(purchaseBillVo));
    }

}