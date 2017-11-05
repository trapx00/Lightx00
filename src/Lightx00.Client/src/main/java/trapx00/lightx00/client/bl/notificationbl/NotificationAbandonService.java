package trapx00.lightx00.client.bl.notificationbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public interface NotificationAbandonService {
    /**
     * Abandons a bill.
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    ResultMessage abandon(String id);
}
