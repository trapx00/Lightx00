package trapx00.lightx00.client.bl.notificationbl.controller;

import trapx00.lightx00.client.bl.notificationbl.NotificationOperationService;
import trapx00.lightx00.client.vo.notification.billapproval.BillApprovalNotificationVo;
import trapx00.lightx00.shared.po.ResultMessage;

public class BillApprovalNotificationOperationController implements NotificationOperationService<BillApprovalNotificationVo> {
    @Override
    public ResultMessage abandon(BillApprovalNotificationVo notification) {
        return notification.notificationAbandonService().abandon(notification.getBill().getId());
    }

    @Override
    public ResultMessage activate(BillApprovalNotificationVo notification) {
        return notification.notificationActivateService().activate(notification.getBill().getId());
    }
}
