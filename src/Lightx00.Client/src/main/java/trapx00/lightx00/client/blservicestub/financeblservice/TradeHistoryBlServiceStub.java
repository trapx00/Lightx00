package trapx00.lightx00.client.blservicestub.financeblservice;

import trapx00.lightx00.client.blservice.financeblservice.TradeHistoryBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVo;

import java.util.Date;

public class TradeHistoryBlServiceStub implements TradeHistoryBlService {
    @Override
    public TradeHistoryVo query(TradeHistoryQueryVo query) {
        return new TradeHistoryVo(new BillVo[] {
                new PaymentBillVo("123",new Date(), BillState.Draft, null, null, null, 0)
        });
    }

    @Override
    public ResultMessage export(TradeHistoryVo bills) {
        return ResultMessage.Success;
    }
}
