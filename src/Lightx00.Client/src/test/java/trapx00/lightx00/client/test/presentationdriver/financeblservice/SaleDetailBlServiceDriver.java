package trapx00.lightx00.client.test.presentationdriver.financeblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.SaleDetailBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.SaleDetailBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.financestaff.SaleDetailQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class SaleDetailBlServiceDriver {
    private SaleDetailBlService service = new SaleDetailBlServiceStub();
    private SaleDetailQueryVo query = new SaleDetailQueryVo(new Date(), new Date(),
            "123",null,null,1);
    @Test
    public void query() throws Exception {
        assertEquals(query.getCommodityNames(), service.query(query).getRecords()[0].getCommodityName());
    }

    @Test
    public void export() throws Exception {
        assertEquals( ResultMessage.Success,
                service.export(service.query(query))
        );
    }

}