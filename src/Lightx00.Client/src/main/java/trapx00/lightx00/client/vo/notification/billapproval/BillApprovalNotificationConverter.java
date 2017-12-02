package trapx00.lightx00.client.vo.notification.billapproval;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.bl.financebl.BillInfo;
import trapx00.lightx00.client.bl.financebl.factory.BillInfoBlFactory;
import trapx00.lightx00.client.vo.notification.NotificationConverterClass;
import trapx00.lightx00.client.vo.notification.NotificationConverter;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;

@NotificationConverterClass(notificationType = NotificationType.BillApproval)
public class BillApprovalNotificationConverter implements NotificationConverter<BillApprovalNotificationVo> {

    private BillInfo billInfo = BillInfoBlFactory.getBillInfo();
    private EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();

    /**
     * Converts NotificationPo to NotificationVo.
     *
     * @param po NotificationPo
     * @return NotificationVo
     */
    @Override
    public BillApprovalNotificationVo convertToVo(NotificationPo po) {
        return new BillApprovalNotificationVo(
            po.getId(),
            po.getDate(),
            employeeInfo.queryById(po.getSenderId()),
            employeeInfo.queryById(po.getReceiverId()),
            billInfo.queryBill(po.getContent())
        );
    }

    @Override
    public NotificationPo convertToPo(BillApprovalNotificationVo vo) {
        return new NotificationPo(
            vo.getId(),
            vo.getDate(),
            vo.getSender().getId(),
            vo.getReceiver().getId(),
            vo.getType(),
            vo.getBill().getId()
        );
    }
}
