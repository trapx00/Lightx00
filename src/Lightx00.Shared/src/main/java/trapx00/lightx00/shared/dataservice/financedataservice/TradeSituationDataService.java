package trapx00.lightx00.shared.dataservice.financedataservice;

import java.util.Date;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVo;



public interface TradeSituationDataService {
    TradeSituationVo query(Date start, Date end);
}
