package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.TradeSituationDataService;
import trapx00.lightx00.shared.vo.financestaff.TradeSituationVo;

import java.util.Date;

public class TradeSituationDataServiceStub implements TradeSituationDataService {

    @Override
    public TradeSituationVo query(Date start, Date end) {
        return new TradeSituationVo(0,0,0,0,0);
    }
}
