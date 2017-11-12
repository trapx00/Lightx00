package trapx00.lightx00.client.test.bl.logbl;

import org.junit.Test;
import sun.rmi.runtime.Log;
import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.client.bl.logbl.factory.LogBlFactory;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;

import static org.junit.Assert.*;

public class LogBlControllerTest {
    private LogBlController controller = LogBlFactory.getController();
    @Test
    public void log() throws Exception {
        assertEquals(ResultMessage.Success, controller.log(LogSeverity.Success, "123"));
    }

    @Test
    public void query() throws Exception {
        assertNotNull(controller.query(x->true));
    }

}