package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.blservice.financeblservice.TradeHistoryBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.FinanceBillQueryVo;
import trapx00.lightx00.shared.vo.financestaff.FinanceBillVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryQueryVo;
import trapx00.lightx00.shared.vo.financestaff.TradeHistoryVo;

public class TradeHistoryBlController implements TradeHistoryBlService, FinanceBillInfo {
    /**
     * Queries FinanceBill
     *
     * @param query FinanceBill query condition
     * @return Finance bills that match query condition
     */
    @Override
    public FinanceBillVo[] query(FinanceBillQueryVo query) {
        return null;
    }

    /**
     * Queries a TradeHistory
     *
     * @param query TradeHistory query condition
     * @return TradeHistory that matches query condition
     */
    @Override
    public TradeHistoryVo query(TradeHistoryQueryVo query) {
        return null;
    }

    /**
     * Export a TradeHistory
     *
     * @param tradeHistory TradeHistory to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(TradeHistoryVo tradeHistory) {
        return null;
    }
}