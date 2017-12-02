package trapx00.lightx00.client.vo.notification.others;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.vo.notification.NotificationConverterClass;
import trapx00.lightx00.client.vo.notification.NotificationConverter;
import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;

@NotificationConverterClass(notificationType = NotificationType.Others)
public class OtherNotificationConverter implements NotificationConverter<OtherNotificationVo> {

    private EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();

    /**
     * Converts NotificationPo to NotificationVo.
     *
     * @param po NotificationPo
     * @return NotificationVo
     */
    @Override
    public OtherNotificationVo convertToVo(NotificationPo po) {
        return new OtherNotificationVo(
            po.getId(),
            po.getDate(),
            employeeInfo.queryById(po.getSenderId()),
            employeeInfo.queryById(po.getReceiverId()),
            po.getContent()
        );
    }

    @Override
    public NotificationPo convertToPo(OtherNotificationVo vo) {
        return new NotificationPo(
            vo.getId(),
            vo.getDate(),
            vo.getSender().getId(),
            vo.getReceiver().getId(),
            vo.getType(),
            vo.getContent()
        );
    }
}
