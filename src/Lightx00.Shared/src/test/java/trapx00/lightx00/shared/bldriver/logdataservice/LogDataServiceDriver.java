package trapx00.lightx00.shared.bldriver.logdataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservicestub.logdataservice.LogDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;

import static org.junit.Assert.*;

public class LogDataServiceDriver {
    LogDataService service = new LogDataServiceStub();
    @Test
    public void log() throws Exception {
        assertEquals(ResultMessage.Success, service.log(LogSeverity.Success,"123"));
    }

    @Test
    public void query() throws Exception {
        assertEquals("123", service.query(x->true)[0].getContent());
    }

}