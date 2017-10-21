package trapx00.lightx00.client.blservice.approvalblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.manager.BillQueryVo;

public interface AuditBlService {

    ResultMessage show(BillQueryVo query);

    ResultMessage reject(BillVo bill);

    ResultMessage pass(BillVo bill);
}
