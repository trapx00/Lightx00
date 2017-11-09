package trapx00.lightx00.client.test.presentationdriver.inventoryblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseRefundBillBlService;
import trapx00.lightx00.client.blservicestub.inventoryblservice.PurchaseRefundBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.salestaff.PurchaseRefundBillVo;

import static org.junit.Assert.*;

public class PurchaseRefundBillBlServiceDriver {

    PurchaseRefundBillBlService service=new PurchaseRefundBillBlServiceStub();
    PurchaseRefundBillVo purchaseRefundBillVo;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(purchaseRefundBillVo));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.saveAsDraft(purchaseRefundBillVo));
    }

}