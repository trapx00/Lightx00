package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.function.Predicate;

public class NotificationQueryVo extends BaseQueryVo<NotificationPo, Integer, NotificationQueryVo> {
    public NotificationQueryVo() {
    }

    public NotificationQueryVo(BaseQueryVo another) {
        super(another);
    }
}
