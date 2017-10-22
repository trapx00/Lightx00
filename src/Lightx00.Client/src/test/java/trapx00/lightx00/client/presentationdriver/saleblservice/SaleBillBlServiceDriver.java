package trapx00.lightx00.client.presentationdriver.saleblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.saleblservice.SaleBillBlService;
import trapx00.lightx00.client.blservicestub.saleblservice.SaleBillBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.SaleBillVo;

import static org.junit.Assert.*;

public class SaleBillBlServiceDriver {

    SaleBillBlService service=new SaleBillBlServiceStub();
    SaleBillVo saleBillVo;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(saleBillVo));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.saveAsDraft(saleBillVo));
    }

}