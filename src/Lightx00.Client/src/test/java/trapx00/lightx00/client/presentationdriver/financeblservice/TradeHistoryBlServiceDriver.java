package trapx00.lightx00.client.presentationdriver.financeblservice;

import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.client.blservice.financeblservice.TradeHistoryBlService;
import trapx00.lightx00.client.blservicestub.financeblservice.TradeHistoryBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class TradeHistoryBlServiceDriver {
    TradeHistoryBlService service = new TradeHistoryBlServiceStub();
    BillVo bill;

    @Before
    public void setUp() throws Exception {
        bill = service.query(
                new TradeHistoryQueryVo(new Date(), new Date(), BillType.FinanceBill,null,null,1)).getBills()[0];
    }

    @Test
    public void query() throws Exception {
        assertEquals(BillType.FinanceBill, bill.getBill());
    }

    @Test
    public void revert() throws Exception {
        assertEquals(bill, service.revert(bill) );
    }

    @Test
    public void export() throws Exception {
        assertEquals(ResultMessage.Success,
                service.export(service.query(
                new TradeHistoryQueryVo(new Date(), new Date(), BillType.FinanceBill,null,null,1))));
    }

}