package trapx00.lightx00.client.test.presentationdriver.saleblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.saleblservice.SaleRefundBillBlService;
import trapx00.lightx00.client.blservicestub.saleblservice.SaleRefundBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleRefundBillVo;

import static org.junit.Assert.*;

public class SaleRefundBillBlServiceDriver {

    SaleRefundBillBlService service=new SaleRefundBillBlServiceStub();
    SaleRefundBillVo saleRefundBillVo;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(saleRefundBillVo));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(saleRefundBillVo));
    }

}