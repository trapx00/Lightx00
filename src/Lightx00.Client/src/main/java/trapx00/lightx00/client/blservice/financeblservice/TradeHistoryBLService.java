package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.BillVO;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVO;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVO;

public interface TradeHistoryBLService {
    TradeHistoryVO query(TradeHistoryQueryVO query);
    BillVO revert(BillVO selectedBill);
    ResultMessage export(TradeHistoryVO bills);
}
