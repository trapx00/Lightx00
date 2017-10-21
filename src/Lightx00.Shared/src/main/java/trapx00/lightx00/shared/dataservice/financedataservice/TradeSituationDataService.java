package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.vo.financestaff.TradeSituationVO;

import java.util.Date;

public interface TradeSituationDataService {
    TradeSituationVO query(Date start, Date end);
}
