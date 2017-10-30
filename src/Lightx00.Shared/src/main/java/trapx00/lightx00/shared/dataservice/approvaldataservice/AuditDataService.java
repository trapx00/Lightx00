package trapx00.lightx00.shared.dataservice.approvaldataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

import java.util.Date;

public interface AuditDataService {
    BillVo[] query(BillQueryVo query);

    ResultMessage reject(BillVo bill);

    ResultMessage pass(BillVo bill);
}
