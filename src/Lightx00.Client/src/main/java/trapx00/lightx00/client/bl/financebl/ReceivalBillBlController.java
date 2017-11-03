package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.financeblservice.ReceivalBillBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVo;

public class ReceivalBillBlController implements ReceivalBillBlService, NotificationActivateService, NotificationAbandonService {
    @Override
    public ResultMessage submit(ReceivalBillVo bill) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(ReceivalBillVo bill) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public ResultMessage abandon(BillVo bill) {
        return null;
    }

    @Override
    public ResultMessage activate(BillVo bill) {
        return null;
    }
}
