package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVO;

import java.util.Date;

public interface TradeSituationBLService {
    TradeSituationVO query(Date start, Date end);
    ResultMessage export(TradeSituationVO situation);
}
