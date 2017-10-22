package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVo;

import java.util.Date;

public interface TradeSituationBlService {

    TradeSituationVo query(Date start, Date end);

    ResultMessage export(TradeSituationVo situation);
}
