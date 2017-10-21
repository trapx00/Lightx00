package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailQueryVo;
import trapx00.lightx00.shared.vo.financestaff.SaleDetailVo;

public interface SaleDetailBlService {

    SaleDetailVo query(SaleDetailQueryVo query);

    ResultMessage export(SaleDetailVo detail);
}
