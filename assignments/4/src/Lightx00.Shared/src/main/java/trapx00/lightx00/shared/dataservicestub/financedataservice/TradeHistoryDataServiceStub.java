package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.TradeHistoryDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;

import java.util.Date;

public class TradeHistoryDataServiceStub implements TradeHistoryDataService {
    @Override
    public BillPo[] query(Date start, Date end, BillType billType, ClientPo client, EmployeePo operator, int repository) {
        return new BillPo[] {
                new PaymentBillPo("123",start,BillState.Draft,"123","123",null,0)
        };
    }
}
