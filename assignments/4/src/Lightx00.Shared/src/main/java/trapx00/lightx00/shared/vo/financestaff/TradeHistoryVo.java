package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.vo.BillVo;

public class TradeHistoryVo { //经营历程表
    private BillVo[] bills;

    public TradeHistoryVo(BillVo[] bills) {
        this.bills = bills;
    }

    public BillVo[] getBills() {
        return bills;
    }

    public void setBills(BillVo[] bills) {
        this.bills = bills;
    }
}
