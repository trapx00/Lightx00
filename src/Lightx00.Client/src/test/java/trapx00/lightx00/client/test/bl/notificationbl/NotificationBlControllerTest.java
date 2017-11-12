package trapx00.lightx00.client.test.bl.notificationbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;
import trapx00.lightx00.client.bl.notificationbl.factory.NotificationBlFactory;
import trapx00.lightx00.client.bl.notificationbl.mock.NotificationBlControllerMock;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlServiceFactory;
import trapx00.lightx00.client.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.client.vo.notification.OtherNotificationVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.Date;

import static org.junit.Assert.*;

public class NotificationBlControllerTest {
    private NotificationBlController controller = NotificationBlFactory.getController();
    private BillApprovalNotificationVo commonUsedNotification = new BillApprovalNotificationVo("123",new Date(),null,null,null);
    @Test
    public void addNotification() throws Exception {
        assertEquals(ResultMessage.Success, controller.addNotification(commonUsedNotification));
    }

    @Test
    public void update() throws Exception {
        assertEquals(1, controller.update().length);
    }

    @Test
    public void acknowledge() throws Exception {
        assertEquals(ResultMessage.Success, controller.acknowledge(commonUsedNotification));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, controller.abandon(commonUsedNotification));
    }

}