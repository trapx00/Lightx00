package trapx00.lightx00.shared.bldriver.financedataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.financedataservice.SaleDetailDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.SaleDetailDataServiceStub;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;

import java.util.Date;

import static org.junit.Assert.*;

public class SaleDetailDataServiceDriver {
    SaleDetailDataService service = new SaleDetailDataServiceStub();
    @Test
    public void query() throws Exception {
        SaleDetailVo detailVo = service.query(new Date(), new Date(),"123",null,null,0);
        assertEquals("123",detailVo.getRecords()[0].getCommodityName());
    }

}