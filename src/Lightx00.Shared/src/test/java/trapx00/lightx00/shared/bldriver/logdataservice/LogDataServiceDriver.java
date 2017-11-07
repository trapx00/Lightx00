package trapx00.lightx00.shared.bldriver.logdataservice;

import com.sun.org.apache.xml.internal.dtm.ref.DTMNamedNodeMap;
import org.junit.Test;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.dataservicestub.logdataservice.LogDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;

import java.util.Date;

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