package trapx00.lightx00.client.test.presentationdriver.notificationblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.client.blservicestub.notificationblservice.NotificationBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.shared.vo.notification.NotificationVo;

import static org.junit.Assert.*;

public class NotificationBlServiceDriver {

    NotificationBlService service = new NotificationBlServiceStub();
    NotificationVo[] notifications;

    @Before
    public void setUp() throws Exception {
        notifications = service.update();
    }

    @Test
    public void update() throws Exception {
        assertEquals("123",notifications[0].getId());
    }

    @Test
    public void acknowledge() throws Exception {
        assertEquals(ResultMessage.Success, service.acknowledge(notifications[1]));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success, service.activate((BillApprovalNotificationVo)notifications[1]));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, service.abandon((BillApprovalNotificationVo)notifications[1]));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success, service.abandon((BillApprovalNotificationVo)notifications[1]));
    }

}