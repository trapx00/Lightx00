package trapx00.lightx00.shared.dataservice.financedataservice;

import java.util.Date;
import trapx00.lightx00.shared.po.EmployeePo;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVo;


public interface TradeHistoryDataService {

    TradeHistoryVo query(Date start, Date end, BillType billType, ClientPo client,
                         EmployeePo operator, int repository);
}
