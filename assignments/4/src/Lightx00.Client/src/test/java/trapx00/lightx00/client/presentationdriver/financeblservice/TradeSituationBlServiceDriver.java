package trapx00.lightx00.client.presentationdriver.financeblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.TradeSituationBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.TradeSituationBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVo;

import javax.xml.transform.Result;
import java.util.Date;

import static org.junit.Assert.*;

public class TradeSituationBlServiceDriver {
    TradeSituationBlService service = new TradeSituationBlServiceStub();
    TradeSituationVo situationVo;

    @Before
    public void setUp() throws Exception {
        situationVo = service.query(new Date(), new Date());
    }

    @Test
    public void query() throws Exception {
        assertEquals(100,situationVo.getCommodityCost(),0.1);
    }

    @Test
    public void export() throws Exception {
        assertEquals(ResultMessage.Success, service.export(situationVo));
    }

}