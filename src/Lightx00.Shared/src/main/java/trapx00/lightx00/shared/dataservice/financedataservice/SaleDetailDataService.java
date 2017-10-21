package trapx00.lightx00.shared.dataservice.financedataservice;

import trapx00.lightx00.shared.po.client.ClientPO;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPO;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVO;

import java.util.Date;

public interface SaleDetailDataService {
    SaleDetailVO query(Date start, Date end, String commodityName, ClientPO client, SaleStaffPO operator, int inventory);
}
