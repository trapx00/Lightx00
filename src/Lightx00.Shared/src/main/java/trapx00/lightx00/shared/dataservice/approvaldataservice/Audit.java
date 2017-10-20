package trapx00.lightx00.shared.dataservice.approvaldataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVO;

import java.util.Date;

public interface Audit {
    BillVO[] query(String ID, BillType type, Date date, BillState state);
    ResultMessage reject(BillVO bill);
    ResultMessage pass(BillVO bill);
}
