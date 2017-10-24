package trapx00.lightx00.shared.dataservicestub.financedataservice;

import trapx00.lightx00.shared.dataservice.financedataservice.SaleDetailDataService;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;
import trapx00.lightx00.shared.vo.financestaff.SaleRecordVo;

import java.util.Date;

public class SaleDetailDataServiceStub implements SaleDetailDataService {
    @Override
    public SaleDetailVo query(SaleDetailQueryVo query) {
        return new SaleDetailVo(new SaleRecordVo[]
                { new SaleRecordVo(query.getStart(),query.getCommodityName(),"123",123,123,123) }
        );
    }
}
