package trapx00.lightx00.shared.dataservice.financedataservice;

import java.util.Date;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPo;


public interface TradeHistoryDataService {
    BillPo[] query(Date start, Date end, BillType billType, ClientPo client,
                   EmployeePo operator, int repository);
}
