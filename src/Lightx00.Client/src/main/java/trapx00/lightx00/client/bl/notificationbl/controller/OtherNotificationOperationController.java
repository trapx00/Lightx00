package trapx00.lightx00.client.bl.notificationbl.controller;

import trapx00.lightx00.client.bl.notificationbl.NotificationOperationService;
import trapx00.lightx00.client.vo.notification.others.OtherNotificationVo;
import trapx00.lightx00.shared.po.ResultMessage;

public class OtherNotificationOperationController implements NotificationOperationService<OtherNotificationVo> {
    @Override
    public ResultMessage abandon(OtherNotificationVo notification) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(OtherNotificationVo notification) {
        return ResultMessage.Success;
    }
}
