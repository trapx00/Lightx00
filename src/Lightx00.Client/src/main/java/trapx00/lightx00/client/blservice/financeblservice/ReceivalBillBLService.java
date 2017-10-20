package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.ReceivalBillVO;

public interface ReceivalBillBLService {
    ResultMessage submit(ReceivalBillVO bill);
    ResultMessage saveAsDraft(ReceivalBillVO bill);
    ReceivalBillVO resume();
}
