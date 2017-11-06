package trapx00.lightx00.server.data.financedata.approvaldata;

import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

public class AuditDataController implements AuditDataService {

    /**
     *
     * @param query
     * @return
     */
    @Override
    public BillVo[] query(BillQueryVo query) {
        return new BillVo[0];
    }

    /**
     *
     * @param bill
     * @return
     */
    @Override
    public ResultMessage reject(BillVo bill) {
        return null;
    }

    /**
     *
     * @param bill
     * @return
     */
    @Override
    public ResultMessage pass(BillVo bill) {
        return null;
    }
}
