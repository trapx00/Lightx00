package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.TradeHistoryDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;

import java.util.Date;

public class TradeHistoryDataServiceStub implements TradeHistoryDataService {
    @Override
    public BillPo[] query(TradeHistoryQueryVo query) {
        return new BillPo[] {
                new PaymentBillPo("123",query.getStart(),BillState.Draft,"123","123",null,0)
        };
    }
}
