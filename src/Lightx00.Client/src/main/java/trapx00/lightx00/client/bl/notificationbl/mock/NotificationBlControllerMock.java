package trapx00.lightx00.client.bl.notificationbl.mock;

import trapx00.lightx00.client.bl.notificationbl.NotificationBlController;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.client.vo.notification.OtherNotificationVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.notification.BillApprovalNotificationVo;
import trapx00.lightx00.client.vo.notification.NotificationVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.Transcation;

import java.util.Date;

public class NotificationBlControllerMock extends NotificationBlController {
    /**
     * Adds a notification.
     *
     * @param notification notification to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage addNotification(NotificationVo notification) {
        return ResultMessage.Success;
    }

    /**
     * Updates current user's notifications
     *
     * @return current users's notifications
     */
    public NotificationVo[] update() {
        EmployeeVo employeeVo = new FinanceStaffVo("123","123", new Date(),"123");
        return new NotificationVo[] {
                new OtherNotificationVo("123",new Date(), employeeVo, employeeVo, "test"),
                new BillApprovalNotificationVo("123",new Date(),employeeVo, employeeVo,
                        new PaymentBillVo("123",new Date(),
                                BillState.Approved, "123", "123",new Transcation[]{ new Transcation("123",1,"123")},1))};
    }

    /**
     * Acknowledges a notification. For a BillApprovalNotification with a bill that is approved of, it also activates the bill.
     *
     * @param notification notification
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage acknowledge(NotificationVo notification) {
        return ResultMessage.Success;
    }

    /**
     * Abandons a bill.
     *
     * @param notification notification with a bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(BillApprovalNotificationVo notification) {
        return ResultMessage.Success;
    }
}
