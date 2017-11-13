package trapx00.lightx00.shared.bldriver.notificationdataservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.dataservicestub.notificationdataservice.NotificationDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationPo;

import static org.junit.Assert.*;

public class NotificationDataServiceDriver {
    private NotificationDataService service = new NotificationDataServiceStub();
    private NotificationPo[] notifications;
    @Before
    public void setUp() throws Exception {
        notifications = service.update(x->true);
    }

    @Test
    public void update() throws Exception {
        assertEquals("123", notifications[0].getId());
    }

    @Test
    public void acknowledge() throws Exception {
        assertEquals(ResultMessage.Success, service.acknowledge(notifications[0]));
    }

}