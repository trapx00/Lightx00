package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.notification.NotificationPo;
import trapx00.lightx00.shared.po.notification.NotificationType;

import java.util.function.Predicate;

public class NotificationQueryVo extends BaseQueryVo<NotificationPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public NotificationQueryVo(QueryBuilderPreparation<NotificationPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public NotificationQueryVo() {
        super();
    }
}
