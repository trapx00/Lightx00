package trapx00.lightx00.shared.bldriver.financedataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.financedataservice.TradeHistoryDataService;
import trapx00.lightx00.shared.dataservicestub.financedataservice.TradeHistoryDataServiceStub;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class TradeHistoryDataServiceDriver {
    TradeHistoryDataService service = new TradeHistoryDataServiceStub();
    @Test
    public void query() throws Exception {
        BillPo[] bills = service.query(new Date(), new Date(), BillType.FinanceBill,null,null,0);
        assertEquals("123", bills[0].getId());
    }

}