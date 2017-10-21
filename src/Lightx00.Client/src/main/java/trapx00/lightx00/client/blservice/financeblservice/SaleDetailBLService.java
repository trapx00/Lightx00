package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailQueryVO;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVO;

public interface SaleDetailBLService {
    SaleDetailVO query(SaleDetailQueryVO query);
    ResultMessage export(SaleDetailVO detail);
}
