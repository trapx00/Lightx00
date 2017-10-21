package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.EmployeePO;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPO;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVO;

import java.util.Date;

public interface TradeHistoryDataService {
    TradeHistoryVO query(Date start, Date end, BillType billType, ClientPO client, EmployeePO operator, int respository);
}
