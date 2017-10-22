package trapx00.lightx00.shared.bldriver.financedataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.financedataservice.TradeSituationDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.TradeSituationDataServiceStub;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVo;

import java.util.Date;

import static org.junit.Assert.*;

public class TradeSituationDataServiceDriver {
    TradeSituationDataService service = new TradeSituationDataServiceStub();
    @Test
    public void query() throws Exception {
        TradeSituationVo tradeSituationVo = service.query(new Date(), new Date());
        assertEquals(0, tradeSituationVo.getCommodityCost(), 0.01);
    }

}