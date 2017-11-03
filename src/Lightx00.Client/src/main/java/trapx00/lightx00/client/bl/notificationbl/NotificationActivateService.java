package trapx00.lightx00.client.bl.notificationbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;

public interface NotificationActivateService {
    /**
     * Activates a bill that has been approved of.
     * @param bill bill that has been approved of
     * @return whether the operation is done successfully
     */
    ResultMessage activate(BillVo bill);
}
