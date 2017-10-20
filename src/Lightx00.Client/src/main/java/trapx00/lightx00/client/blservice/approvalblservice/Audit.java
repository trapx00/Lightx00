package trapx00.lightx00.client.blservice.approvalblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVO;
import trapx00.lightx00.shared.vo.manager.BillQueryVO;

public interface Audit {
    ResultMessage show(BillQueryVO query);
    ResultMessage reject(BillVO bill);
    ResultMessage pass(BillVO bill);
}
