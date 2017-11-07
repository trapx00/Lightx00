package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.client.blservice.financeblservice.TradeSituationBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.financestaff.TradeSituationVo;

import java.util.Date;

public class TradeSituationBlController implements TradeSituationBlService {
    /**
     * Queries TradeSituation during specified time range
     *
     * @param start start time
     * @param end   end time
     * @return TradeSituation during specified time range
     */
    @Override
    public TradeSituationVo query(Date start, Date end) {
        return null;
    }

    /**
     * Exports a TradeSituation
     *
     * @param situation TradeSituation to be exported
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage export(TradeSituationVo situation) {
        return null;
    }
}
