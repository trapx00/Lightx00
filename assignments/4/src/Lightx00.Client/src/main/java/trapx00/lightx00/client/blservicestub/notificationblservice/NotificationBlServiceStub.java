package trapx00.lightx00.client.blservicestub.notificationblservice;

import java.util.Date;
import trapx00.lightx00.client.blservice.notificationblservice.NotificationBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.shared.vo.notification.NotificationVo;
import trapx00.lightx00.shared.vo.notification.OtherNotificationVo;



public class NotificationBlServiceStub implements NotificationBlService {
    @Override
    public NotificationVo[] update() {
        return new NotificationVo[] {
                new OtherNotificationVo("123",new Date(), null, null, "test"),
                new BillApprovalNotificationVo("123",new Date(),null, null,
                        new PaymentBillVo("123",new Date(),
                                BillState.Approved, null, null,null,0))};
    }

    @Override
    public ResultMessage acknowledge(NotificationVo notification) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage activate(BillApprovalNotificationVo notification) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage abandon(BillApprovalNotificationVo notification) {
        notification.getBill().setState(BillState.Abandoned);
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(BillApprovalNotificationVo notification) {
        return ResultMessage.Success;
    }
}
