package trapx00.lightx00.shared.dataservice.financedataservice;

import java.util.Date;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;



public interface SaleDetailDataService {
    SaleDetailVo query(Date start, Date end, String commodityName, ClientPo client,
                       SaleStaffPo operator, int inventory);
}
