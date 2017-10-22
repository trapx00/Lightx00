package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVo;

public interface TradeHistoryBlService {

    TradeHistoryVo query(TradeHistoryQueryVo query);

    BillVo revert(BillVo selectedBill);

    ResultMessage export(TradeHistoryVo bills);
}
