package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.notification.NotificationPo;

import java.util.function.Predicate;

public class NotificationQueryVo extends BaseQueryVo<NotificationPo, String> {
    public NotificationQueryVo(QueryBuilderPreparation<NotificationPo, String> preparation) {
        super(preparation);
    }
}
