package trapx00.lightx00.shared.dataservice.financedataservice;

import java.util.Date;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;


public interface TradeHistoryDataService {
    BillPo[] query(TradeHistoryQueryVo query);
}
